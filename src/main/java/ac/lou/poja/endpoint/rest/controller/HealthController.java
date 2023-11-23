package ac.lou.poja.endpoint.rest.controller;

import static java.util.UUID.randomUUID;

import ac.lou.poja.PojaGenerated;
import ac.lou.poja.endpoint.event.EventProducer;
import ac.lou.poja.endpoint.event.gen.UuidCreated;
import ac.lou.poja.repository.DummyRepository;
import ac.lou.poja.repository.DummyUuidRepository;
import ac.lou.poja.repository.model.Dummy;
import ac.lou.poja.repository.model.DummyUuid;
import java.util.List;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@Value
public class HealthController {

  DummyRepository dummyRepository;
  DummyUuidRepository dummyUuidRepository;
  EventProducer eventProducer;

  @GetMapping("/ping")
  public String ping() {
    return "pong";
  }

  @GetMapping("/dummy-table")
  public List<Dummy> dummyTable() {
    return dummyRepository.findAll();
  }

  @GetMapping(value = "/uuid-created")
  public String uuidCreated() throws InterruptedException {
    var randomUuid = randomUUID().toString();
    var event = new UuidCreated().toBuilder().uuid(randomUuid).build();

    eventProducer.accept(List.of(event));

    Thread.sleep(20_000);
    return dummyUuidRepository.findById(randomUuid).map(DummyUuid::getId).orElseThrow();
  }
  @GetMapping("/even")
  public int getEvent() {

    // Génère un nombre aléatoire entre 0 (inclus) et Integer.MAX_VALUE
    int n = (int) (Integer.MAX_VALUE * Math.random());

    // Si le nombre est impair, ajoute 1 pour le rendre pair
    return (n % 2 == 0) ? n : n + 1;

  }


}

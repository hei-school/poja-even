package ac.lou.poja.endpoint.rest.controller;

import static java.util.UUID.randomUUID;

import java.util.List;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.poja.PojaGenerated;
import school.hei.poja.endpoint.event.EventProducer;
import school.hei.poja.endpoint.event.gen.UuidCreated;
import school.hei.poja.repository.DummyRepository;
import school.hei.poja.repository.DummyUuidRepository;
import school.hei.poja.repository.model.Dummy;
import school.hei.poja.repository.model.DummyUuid;

@PojaGenerated
@RestController
@Value
public class EvenController {
  DummyRepository dummyRepository;
  DummyUuidRepository dummyUuidRepository;
  EventProducer eventProducer;

  @GetMapping("/even")
  public int getEvenNumber() {
    Random random = new Random();
    int evenNumber = random.nextInt(Integer.MAX_VALUE / 20) * 2;
    return evenNumber;
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
}

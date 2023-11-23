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
public class EvenController {

    DummyRepository dummyRepository;
    DummyUuidRepository dummyUuidRepository;
    EventProducer eventProducer;

    @GetMapping("/even")
    public int getEven(){
        int n = (int) (Integer.MAX_VALUE * Math.random());
        return n % 2 != 0 ? n-1 : n;
    }
}
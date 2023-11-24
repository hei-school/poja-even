package ac.lou.poja.endpoint.rest.controller;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@Value
public class EvenController {
    @GetMapping("/even")
    public int getEven() {
        return generateEvenNumber();
    }

    private int generateEvenNumber() {
        int randomValue = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
        return randomValue % 2 == 0 ? randomValue : randomValue - 1;
    }
}

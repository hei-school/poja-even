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
        return ThreadLocalRandom.current().ints(1, Integer.MAX_VALUE)
                .filter(value -> value % 2 == 0)
                .findFirst()
                .orElseGet(() -> ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE - 1));
    }
}
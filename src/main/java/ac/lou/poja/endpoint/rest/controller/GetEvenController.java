package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/Even")
public class GetEvenController {
    @GetMapping
    public Integer getRandomEvenNumber() {
        int randomInt = generateRandomInteger();
        return makeEven(randomInt);
    }

    private int generateRandomInteger() {
        return ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
    }

    private int makeEven(int number) {
        return number % 2 == 0 ? number : number + 1;
    }
}

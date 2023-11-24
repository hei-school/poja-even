package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenController {

    @GetMapping("/ping")
    public String ping() {

        return "pong";
    }

    @GetMapping("/even")
    public int getEven() {
        int number = generateRandomNumber();
        return isEven(number) ? number - 1 : number;
    }

    private int generateRandomNumber() {
        return (int) (Integer.MAX_VALUE * Math.random());
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
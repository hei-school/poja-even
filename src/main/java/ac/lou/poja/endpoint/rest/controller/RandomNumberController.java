package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomNumberController {

    @GetMapping("/even")
    public int getEven() {
        int number = (int) (Integer.MAX_VALUE * Math.random());

        return number % 2 == 0 ? number : number + 1;
    }
}

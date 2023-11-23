package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenController {
    @GetMapping("/even")
    public int getRandomEven(){
        int randomNumber = (int) (Integer.MAX_VALUE * Math.random());
        return randomNumber % 2 == 0 ? randomNumber : ++randomNumber;
    }
}

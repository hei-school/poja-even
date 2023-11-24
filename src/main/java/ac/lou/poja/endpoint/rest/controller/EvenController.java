package ac.lou.poja.endpoint.rest.controller;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Value
public class EvenController {
    @GetMapping("/even")
    public int getEvenNumber() {
        int number = (int) (Math.random() * Integer.MAX_VALUE);
        return number % 2 == 0 ? number :number - 1;
    }
}
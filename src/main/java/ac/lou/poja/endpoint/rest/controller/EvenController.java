package ac.lou.poja.endpoint.rest.controller;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Value
public class EvenController {
    @GetMapping("/even")
    public int getEven() {
        int randomValue = (int) (Math.random() * Integer.MAX_VALUE);
        if (randomValue % 2 == 0) {
            return randomValue;
        }
        return randomValue - 1;
    }
}
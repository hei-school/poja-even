package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

    @GetMapping("/even")
    public int getEven() {
        int num = (int) (Integer.MAX_VALUE * Math.random());

        return num % 2 == 0 ? num : num + 1;
    }
}

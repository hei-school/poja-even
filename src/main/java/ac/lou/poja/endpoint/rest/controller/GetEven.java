package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetEven {
    @GetMapping("/even")
    public int getEven() {

        int value = (int) (Integer.MAX_VALUE * Math.random());

        return value % 2 == 0 ? value : value + 1;
    }
}
package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenController {

    @GetMapping("/even")
    public int getEven() {
        int n = (int) (Integer.MAX_VALUE * Math.random());
        return n % 2 == 0 ? n - 1 : n;
    }

}
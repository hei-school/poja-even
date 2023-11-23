package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenController {
    @GetMapping(path = "/even")
    public int getEven(){
        int result = (int) (Integer.MAX_VALUE * Math.random());
        return result%2 == 0 ? result : result - 1;
    }
}

package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberGeneratorController {
    @GetMapping("/even")
    public int generateEven(){
        return 2 * ( (int) (Integer.MAX_VALUE / 2 * Math.random()) );
    }
}

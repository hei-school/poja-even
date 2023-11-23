package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ac.lou.poja.PojaGenerated;
import lombok.Value;


@PojaGenerated
@RestController
@Value
public class EvenController {

    @GetMapping("/even")
    public int getEven() {
        int randomInt = (int) (Integer.MAX_VALUE * Math.random());
        return randomInt % 2 == 0 ? randomInt : randomInt + 1;
    }

}

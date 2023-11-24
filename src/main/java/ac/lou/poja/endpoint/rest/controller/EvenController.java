package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.PojaGenerated;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@Value
public class EvenController {
    @GetMapping("/even")
    public int getEven(){
        int n =  (int)((Integer.MAX_VALUE / 2) * Math.random()) * 2;
        return n % 2 == 0 ? n : n - 1;
    }
}

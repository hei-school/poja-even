package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.PojaGenerated;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PojaGenerated
@Value
public class EvenController {
    @GetMapping("/even")
    public int GetEven(){
        int n= (int) (Integer.MAX_VALUE * Math.random());
        return n % 2 == 0 ? n : n - 1 ;
    }
}

package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.PojaGenerated;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@PojaGenerated
@RestController
@Value
public class EvenController {
    @GetMapping("/GetEven")
    public int even(){
        int n = (int) (Math.random() * Integer.MAX_VALUE);
        return n % 2 == 0 ? n : n + 1 ;
    }
}


package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.PojaGenerated;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@Value
public class EvenController {
    @GetMapping("/Even")
    public int getEven(){
        int number=(int) (Integer.MAX_VALUE*Math.random());
       return number%2 == 0 ? number : number-1 ;
    }


}

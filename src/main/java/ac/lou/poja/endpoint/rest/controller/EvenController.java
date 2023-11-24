package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/even")
public class EvenController {
    private Random random = new Random();

    @GetMapping
    public Integer getEvenNumber(){
        int randomInt = random.nextInt(Integer.MAX_VALUE);
        return  randomInt % 2 == 0 ? randomInt : randomInt + 1 ;
    }



}

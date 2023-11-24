package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.endpoint.event.EvenGenerator;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EvenGeneratorController {

    private final EvenGenerator evenGenerator;

    @GetMapping("/even")
    public int evenGenerator(){ return evenGenerator();}

}

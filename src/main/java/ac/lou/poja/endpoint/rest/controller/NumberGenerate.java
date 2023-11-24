package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class NumberGenerate {
    @GetMapping("/even")
    public int generateEven(){
        return (int) (2 * (Integer.MAX_VALUE / 2 * Math.random()));
    }
}

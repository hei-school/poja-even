package ac.lou.poja.controller;

import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenController{
    @GetMapping("/even")
    public ResponseEntity<Integer> getEvenNumber(){
        int evenNumber = generateRandomEvenNumber();
        return ResponseEntity.ok(evenNumber);
    }

    private int generateRandomEvenNumber(){
        Random random = new Random();
        int randomEven = random.nextInt(Integer.MAX_VALUE / 2) * 2;
        return randomEven;
    }
}
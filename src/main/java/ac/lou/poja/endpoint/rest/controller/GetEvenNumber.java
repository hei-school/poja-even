package ac.lou.poja.endpoint.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/even")
public class GetEvenNumber {

    @GetMapping
    public ResponseEntity<Integer> getEvenNumber() {
        int evenNumber = generateRandomEvenNumber();
        return ResponseEntity.ok(evenNumber);
    }

    public int generateRandomEvenNumber() {
        Random random = new Random();
        int number = random.nextInt(Integer.MAX_VALUE);
        return number % 2 == 0 ? number : number + 1;
    }
}

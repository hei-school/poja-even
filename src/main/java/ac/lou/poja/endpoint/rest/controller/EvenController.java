package ac.lou.poja.endpoint.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/poja")
public class EvenController {

    @GetMapping("/even")
    public ResponseEntity<Integer> getEvenNumber() {
        int evenNumber = generateRandomEvenNumber();
        return ResponseEntity.ok(evenNumber);
    }

    private int generateRandomEvenNumber() {
        Random random = new Random();
        int randomNum = random.nextInt(Integer.MAX_VALUE);

        return (randomNum % 2 == 0) ? randomNum : randomNum + 1;
    }
}

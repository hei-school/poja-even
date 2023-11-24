package com.example.demo;
/*import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api")*/

import java.util.Random;

public class EvenController {
    public int getRandomEvenNumber() {
        Random random = new Random();
        int max = Integer.MAX_VALUE;

        // Générer un nombre aléatoire pair entre 0 et Integer.MAX_VALUE
        int randomNumber = random.nextInt((max + 1) / 2) * 2;

        return randomNumber;
    }
}

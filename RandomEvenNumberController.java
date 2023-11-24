package com.example.demo;

public @RestController
@RequestMapping("/even")
class RandomEvenNumberController {

    @GetMapping
    public int getRandomEvenNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(Integer.MAX_VALUE);

        // Assure que le nombre est pair
        return randomNumber % 2 == 0 ? randomNumber : randomNumber + 1;
    }
}

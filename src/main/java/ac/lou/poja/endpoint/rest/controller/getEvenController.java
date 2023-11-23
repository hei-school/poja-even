package ac.lou.poja.endpoint.rest.controller;

import java.util.Random;

public class getEvenController {
    public static int getRandomEvenNumber() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE / 2) * 2;
    }
}

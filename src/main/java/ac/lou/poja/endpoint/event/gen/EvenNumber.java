package ac.lou.poja.endpoint.event.gen;

import java.util.Random;

public class EvenNumber {
    public int GetEven() {
        Random randomNumber = new Random();
         int number = randomNumber.nextInt(Integer.MAX_VALUE / 2) * 2;
        return number;
    }
}

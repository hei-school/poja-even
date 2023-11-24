package ac.lou.poja.endpoint.event;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class EvenGenerator {

    public int evenGenerator(){
        Random random = new Random();
        int number = random.nextInt(Integer.MAX_VALUE);
        if (number % 2 != 0){
            number++;
        }
        return number;

    }
}

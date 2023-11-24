package ac.lou.poja.service.event;

import ac.lou.poja.PojaGenerated;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class EvenService {
    public int genNumber() {
        int number = (int) Math.round(Integer.MAX_VALUE / (Math.random() * 10));
        if (number % 2 != 0 || number < 0) {
            return genNumber();
        }
        return number;
    }
}
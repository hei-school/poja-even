package ac.lou.poja.endpoint.rest.controller;
import ac.lou.poja.PojaGenerated;
import java.util.Random;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController

@GetMapping("/even")
public class EvenController {
    Random random = new Random();
    int even = random.nextInt(Integer.MAX_VALUE / 2) * 2; 
    return even;
}

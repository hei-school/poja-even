package ac.lou.poja.endpoint.rest.controller;

import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenNumberController {

  @GetMapping("/even")
  public static int getEvenNumber() {
    Random random = new Random();
    int evenNumber = random.nextInt(Integer.MAX_VALUE / 2) * 2;
    return evenNumber;
  }
}

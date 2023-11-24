package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomNumberController {
  @GetMapping("/even")
  public int getEvenNumber() {
    Random random = new Random();
    int randomNumber = random.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
    return (randomNumber % 2 == 0) ? randomNumber : ++randomNumber;
  }
}

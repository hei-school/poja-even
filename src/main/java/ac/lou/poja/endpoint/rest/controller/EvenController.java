package ac.lou.poja.endpoint.rest.controller;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Value
public class EvenController {
  @GetMapping("/even")
  public int getEven() {
    int seed = (int) (Math.random() * Integer.MAX_VALUE);
    return seed % 2 == 0 ? seed : seed - 1;
  }
}

package ac.lou.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/number")
public class RandomNumberController {
  @GetMapping("/get_even")
  public int getEven() {
    int result = (int) (Math.random() * Integer.MAX_VALUE);
    return result % 2 == 0 ? result : result - 1;
  }
}

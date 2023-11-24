package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.PojaGenerated;
import ac.lou.poja.service.event.EvenService;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@Value
public class EvenController {
  EvenService evenService;

  @GetMapping("/even")
  public int genNumber() {
    return evenService.genNumber();
  }
}

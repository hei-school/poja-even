package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RandomEvenControllerIT extends FacadeIT {

  @Autowired RandomNumberController randomNumberController;

  @Test
  void should_get_only_even_number() {
    for (int i = 0; i < 30; i++) {
      int randomEven = randomNumberController.getEvenNumber();
      assertEquals(0, randomEven % 2);
    }
  }
}

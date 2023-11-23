package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EvenControllerIT extends FacadeIT {

  @Autowired EvenController evenController;

  @Test
  void can_generate_random_even_number() {
    for (int i = 0; i < 50; i++) {
      int randomEven = evenController.getRandomEven();
      assertEquals(0, randomEven % 2);
    }
  }
}

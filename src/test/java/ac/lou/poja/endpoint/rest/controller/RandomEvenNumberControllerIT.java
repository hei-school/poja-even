package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RandomEvenNumberControllerIT extends FacadeIT {
  @Autowired RandomEvenNumberController randomNumberController;

  @Test
  void generateRandomEvenNumber() {
    for (int i = 0; i < 100; ++i) {
      int randomNumber = randomNumberController.getEvenNumber();
      assertEquals(0, randomNumber % 2);
    }
  }
}

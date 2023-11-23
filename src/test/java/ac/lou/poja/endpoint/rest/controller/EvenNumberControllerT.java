package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

class EvenNumberControllerT extends EvenNumberController {

  @Autowired EvenNumberController evenNumberController;

  @Test
  void testGetEven() {
    int evenNumber = evenNumberController.getEven();
    assertTrue(evenNumber % 2 == 0, "The returned number should be even");
  }
}

package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class NumbersControllerIT extends FacadeIT {

  @Autowired NumbersController numbersController;

  @Test
  void isEven_should_return_true_for_even_numbers() {
    for (int i = 0; i < 50; i++) {
      assertEquals(0, numbersController.getEven() % 2);
    }
  }
}

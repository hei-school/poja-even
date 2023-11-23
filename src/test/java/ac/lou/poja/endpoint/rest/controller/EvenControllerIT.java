package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class EvenControllerIT extends FacadeIT {

  @Autowired
  EvenController evenController;

  @Test
  void checkNumberEven() {
      assertEquals(0, evenController.getEven() % 2);
  }
}

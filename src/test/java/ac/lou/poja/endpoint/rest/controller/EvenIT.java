package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import ac.lou.poja.conf.FacadeIT;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

class EvenIT extends FacadeIT {

  @Autowired EvenController evenController;

  @Test
  void getEven() {
    boolean isEven = (evenController.getEven() % 2 == 0);
    assertTrue(isEven);
  }
}

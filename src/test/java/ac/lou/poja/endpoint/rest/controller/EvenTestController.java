package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EvenTestController extends FacadeIT {

  @Autowired EvenController evenController;

  @Test
  void IsEven() {
    for (int i = 1; i < 50; i++) {
      int result = evenController.getEven();
      assertEquals(0, result % 2);
    }
  }
}

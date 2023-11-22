package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RandomNumberControllerIT extends FacadeIT {
  @Autowired RandomNumberController controller;

  @Test
  public void evenNumberResponse() {
    int response = controller.getEven() % 2;
    assertEquals(0, response);
  }
}

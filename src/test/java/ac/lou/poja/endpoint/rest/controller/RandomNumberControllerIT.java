package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RandomNumberControllerIT extends FacadeIT {
  @Autowired RandomNumberController controller;

  public void threadOneTest(){
    int response = controller.getEven() % 2;
    assertEquals(0, response);
  }

  @Test
  public void evenNumberResponse() {
    for (int i = 0; i < 300; i++) threadOneTest();
  }
}

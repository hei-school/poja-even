package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RandomNumberControllerIT {
  RandomNumberController controller = new RandomNumberController();

  public void threadOneTest(){
    int response = controller.getEven() % 2;
    assertEquals(0, response);
  }

  @Test
  public void evenNumberResponse() {
    for (int i = 0; i < 300; i++) threadOneTest();
  }
}

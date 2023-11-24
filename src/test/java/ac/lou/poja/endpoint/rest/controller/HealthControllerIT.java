package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class HealthControllerIT extends FacadeIT {

  @Autowired HealthController healthController;

  @Test
  void ping() {
    assertEquals("pong", healthController.ping());
  }

  @Test
  void can_read_from_dummy_table() {
    var dummyTableEntries = healthController.dummyTable();
    assertEquals(1, dummyTableEntries.size());
    assertEquals("dummy-tabl²e-id-1", dummyTableEntries.get(0).getId());
  }
  @Test
  void getEvenNumber() {
    int evenNumber = Integer.parseInt(healthController.getEvenNumber());
    assertTrue(isEven(evenNumber));
  }
  private boolean isEven(int number){
    return number % 2 == 0;
  }
}

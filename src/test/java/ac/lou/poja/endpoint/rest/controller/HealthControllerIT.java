package ac.lou.poja.endpoint.rest.controller;

import static org.junit.Assert.assertTrue;
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
    assertEquals("dummy-table-id-1", dummyTableEntries.get(0).getId());
  }

  @Test
  void testGetRandomEvenNumber() {
    int evenNumber = healthController.getRandomEvenNumber();

    assertTrue(evenNumber % 2 == 0);

    assertTrue(evenNumber >= 0 && evenNumber <= Integer.MAX_VALUE);
  }

}

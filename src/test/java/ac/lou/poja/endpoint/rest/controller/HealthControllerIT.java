package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class HealthControllerIT extends FacadeIT {

  @Autowired HealthController healthController;
  @Autowired EvenController evenController;
  @Test
  void ping() {
    assertEquals("pong", healthController.ping());
  }

  @Test
  void testGetEven() {
    int result = evenController.getEven();
    assertTrue(result % 2 != 0, "Le résultat devrait être un nombre impair.");
  }
  @Test
  void can_read_from_dummy_table() {
    var dummyTableEntries = healthController.dummyTable();
    assertEquals(1, dummyTableEntries.size());
    assertEquals("dummy-table-id-1", dummyTableEntries.get(0).getId());
  }
}

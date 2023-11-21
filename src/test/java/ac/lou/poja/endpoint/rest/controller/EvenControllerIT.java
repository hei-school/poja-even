package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EvenControllerIT extends FacadeIT {
  @Autowired EvenController evenController;

  @Test
  void isEven() {
    ArrayList<Integer> randomValues = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      randomValues.add(evenController.getEven());
    }
    assertEquals(0, randomValues.stream().reduce(Integer::sum).orElse(1) % 2);
  }
}

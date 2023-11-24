package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberGeneratorControllerIT extends FacadeIT {

  @Autowired NumberGeneratorController numberGeneratorController;

  @Test
  void isEven() {
    for (int i = 0; i<100; i++){
      assertEquals(0, numberGeneratorController.generateEven() % 2);
    }
  }

}

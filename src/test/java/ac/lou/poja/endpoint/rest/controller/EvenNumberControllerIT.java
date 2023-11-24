package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenNumberControllerIT extends FacadeIT {
    @Autowired
    EvenNumbersController evenNumbersController;

    @Test
    void isNumberEven() {
        for (int i = 0; i < 20; i++) {
            assertEquals(0, evenNumbersController.getEven() % 2);
        }
    }
}

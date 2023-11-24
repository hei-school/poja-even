package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EvenControllerIT extends FacadeIT {

    @Autowired
    protected EvenController evenController;

    @Test
    void getEven_returnsEvenNumber() {
        int evenValue = evenController.getEven();
        assertTrue(evenValue % 2 == 0, "Expected an even number, but got: " + evenValue);
    }
}

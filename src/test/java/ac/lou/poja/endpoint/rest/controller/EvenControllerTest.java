package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class EvenControllerIT extends FacadeIT {

    @Autowired
    EvenController evenController;

    @Test
    void testGetEven() {
        int evenNumber = evenController.GetEven();
        assertEquals(0, evenNumber % 2);
        assertTrue(evenNumber > 0 && evenNumber <= Integer.MAX_VALUE );
    }
}

package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import ac.lou.poja.endpoint.rest.controller.RandomEvenController;
import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RandomEvenControllerTest extends FacadeIT {

    @Autowired
    private RandomEvenController randomEvenController;

    @Test
    public void testGetEven() {
        int evenNumber = randomEvenController.getEven();
        assertTrue(evenNumber >= 0 && evenNumber % 2 == 0 && evenNumber <= Integer.MAX_VALUE);
    }
}


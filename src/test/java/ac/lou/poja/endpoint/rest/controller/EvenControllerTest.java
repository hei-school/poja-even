package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenControllerTest extends FacadeIT {

    @Autowired
    private EvenController evenController;


    @Test
    public void testGetEven() {
        for (int i = 0; i < 100; i++) {
            assertEquals(0, evenController.getEven() % 2);
        }
    }
}

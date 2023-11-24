package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import school.hei.poja.conf.FacadeIT;

public class EvenControllerTest extends FacadeIT {
    @Autowired
    private EvenController evenController;

    @Test
    void testGetEvenNumber() {
        int result = evenController.getEvenNumber();
        assertEquals(0, result % 2, "Le nombre renvoyé doit être pair");
    }
}

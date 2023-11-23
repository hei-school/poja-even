package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenControllerIT extends FacadeIT {
    @Autowired
    EvenController evenController;

    @Test
    void gen_random_even_number() {
        assertEquals(0, (evenController.genNumber() % 2));
    }
}

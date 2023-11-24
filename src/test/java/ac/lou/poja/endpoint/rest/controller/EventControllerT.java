package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EventControllerT extends FacadeIT {

    @Autowired EvenController evenController;

    @Test
    void even() {
        assertTrue(evenController.getEven() % 2 == 0);
    }


}
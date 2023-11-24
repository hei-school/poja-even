package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class EvenControllerIT extends FacadeIT {
    @Autowired EvenController controller;

    @Test
    void even (){
        assertEquals(0 , controller.even() % 2);
    }
}

package school.hei.poja.endpoint.rest.controller;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import school.hei.poja.conf.FacadeIT;

class oddControllerIT extends FacadeIT {

    @Autowired EvenController evenController;

    @Test
    void testGetEven() {
        int evenNumber = evenController.getEven();
        assertTrue(evenNumber%2 == 0 , "The number is not even");

    }
}
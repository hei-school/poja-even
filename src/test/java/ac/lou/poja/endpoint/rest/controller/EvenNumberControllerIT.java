package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EvenNumberController extends FacadeIT {
    @Autowired EvenController controller;

    @Test
    public void GetEvenNumber() {
        int number = controller.getEvenNumber() % 2;
        assertEquals(0 , number);
    }
}
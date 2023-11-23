package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static junit.framework.TestCase.assertEquals;

public class EvenControllerTest extends FacadeIT {
    @Autowired EvenController evenController;

    @Test
    void IsEvenNumber(){
        int result = evenController.getEven();
        assertEquals(0,result%2==0);

    }
}

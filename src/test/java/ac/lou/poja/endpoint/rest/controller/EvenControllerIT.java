package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertTrue;

public class EvenControllerIT extends FacadeIT {
    @Autowired EvenController evenController;
    @Test
    void getEven(){
        int result= evenController.getEven();
        assertTrue("should return an even number",result%2 == 0);
    }
}

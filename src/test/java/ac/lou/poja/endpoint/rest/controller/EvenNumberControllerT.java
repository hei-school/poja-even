package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

class EvenNumberControllerT extends FacadeIT {
    @Autowired EvenNumberController evenNumberController ;
    @Test
    void testGetEven(){
        int even = evenNumberController.getEven();
        Assert.assertTrue(  "The number is even",even %2 == 0);
    }
}

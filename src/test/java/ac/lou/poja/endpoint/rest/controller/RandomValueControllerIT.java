package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomValueControllerIT extends FacadeIT {
    @Autowired
    RandomValueController randomValueController;

    @Test
    public void testRandomValue(){
        for (int i = 0; i < 100; ++i) {
            int randomValue = randomValueController.getEven();
                assertEquals(0, randomValue % 2);
        }
    }
}

package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class NumberControllerIT extends FacadeIT {

    @Autowired
    NumberController numberController;

    @Test
    void checkIfReturnedNumberIsEven() {
        int n = numberController.getEven();
        assertEquals(0, n % 2);
    }
}

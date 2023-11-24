package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class GetEvenTest extends FacadeIT {

    @Autowired GetEven getsEven;

    @Test
    void Even() {
        for (int i = 0; i < 10; i++) {
            assertEquals(0, getsEven.getEven() % 2);
        }
    }
}
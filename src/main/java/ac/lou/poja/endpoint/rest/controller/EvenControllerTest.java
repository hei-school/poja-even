package ac.lou.poja.endpoint.rest.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenControllerTest {

    @Test
    void testOddNumber() {
        EvenController evenController = new EvenController();
        int evenNumber = evenController.getEven();
        assertTrue(evenNumber % 2 == 0, "Number returned from endpoint is not even");
    }

    @Test
    void testMaxOddNumber() {
        EvenController evenController = new EvenController();

        int evenNumber = evenController.getEven();
        assertTrue(evenNumber < Integer.MAX_VALUE, "Number returned is above the MAX_VALUE");

        for (int i = 0; i < 10; i++) {
            evenNumber = evenController.getEven();
            assertTrue(evenNumber % 2 == 0, "Number returned is become odd after multiple tests");
        }
    }
}
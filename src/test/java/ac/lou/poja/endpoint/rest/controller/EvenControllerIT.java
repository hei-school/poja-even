package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenControllerIT extends FacadeIT {

    @Autowired EvenController evenController;
    @Test
    void ping() {
        assertEquals("pong", evenController.ping());
    }

    @Test
    public void testGetEvenNumber() {
        int maxValueEvenNumber = evenController.getEven();
        assertTrue(maxValueEvenNumber % 2 == 0, "returned number even.");
        assertTrue(
                    maxValueEvenNumber >= 0 && maxValueEvenNumber <= Integer.MAX_VALUE,
                    "returned number between 0 and Integer.MAX_VALUE.");
        }
}
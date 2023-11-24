package ac.lou.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import ac.lou.poja.conf.FacadeIT;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class EvenNumberControllerIT extends FacadeIT {

    @Autowired
    EvenNumberController evenNumberController;

    @Test
    public void testGetEvenNumber() {
        int maxValueEvenNumber = evenNumberController.getEvenNumber();
        assertTrue(maxValueEvenNumber % 2 == 0, "The returned number must be even.");
        assertTrue(
                maxValueEvenNumber >= 0 && maxValueEvenNumber <= Integer.MAX_VALUE,
                "The returned number must be between 0 and Integer.MAX_VALUE.");
    }
}

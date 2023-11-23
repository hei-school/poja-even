package ac.lou.poja.endpoint.rest.controller;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class EvenControllerIT {

    @Test
    public void testGetEvenNumber() {
        EvenController controller = new EvenController();
        Integer result = controller.getEvenNumber();
        assertEquals(0, result % 2);
    }

    @Test
    public void testGeneratedNumberIsEven() {
        EvenController controller = new EvenController();
        Integer result = controller.getEvenNumber();
        assertEquals(0, result % 2);
    }


    @Test
    public void testGeneratedNumberIsWithinBounds() {
        EvenController controller = new EvenController();
        Integer result = controller.getEvenNumber();
        Assertions.assertTrue(result >= 0);
    }


    @Test
    public void testControllerReturnsValidInteger() {
        EvenController controller = new EvenController();
        Integer result = controller.getEvenNumber();
        Assertions.assertNotNull(result);
    }

}
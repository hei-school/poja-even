package ac.lou.poja.endpoint.rest.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetEvenNumberIT {

    @Test
    public void testGetEvenNumber() {
        GetEvenNumberController controller = new GetEvenNumberController();
        Integer result = controller.getEvenNumber();
        assertEquals(0, result % 2);
    }

    @Test
    public void testGeneratedNumberIsEven() {
        GetEvenNumberController controller = new GetEvenNumberController();
        Integer result = controller.getEvenNumber();
        assertEquals(0, result % 2);
    }


    @Test
    public void testGeneratedNumberIsWithinBounds() {
        GetEvenNumberController controller = new GetEvenNumberController();
        Integer result = controller.getEvenNumber();
        Assertions.assertTrue(result >= 0);
    }

    @Test
    public void testGeneratedNumberPlusOneIsOdd() {
        GetEvenNumberController controller = new GetEvenNumberController();
        Integer result = controller.getEvenNumber();
        assertEquals(1, (result + 1) % 2);
    }

    @Test
    public void testControllerReturnsValidInteger() {
        GetEvenNumberController controller = new GetEvenNumberController();
        Integer result = controller.getEvenNumber();
        Assertions.assertNotNull(result);
    }

    @Test
    public void testMultipleCallsReturnDifferentNumbers() {
        GetEvenNumberController controller = new GetEvenNumberController();
        Integer result1 = controller.getEvenNumber();
        Integer result2 = controller.getEvenNumber();
        Assertions.assertNotEquals(result1, result2);
    }
}
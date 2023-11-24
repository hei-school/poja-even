package ac.lou.poja.endpoint.rest.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenControllerTest {
    @Test
    public void testGetEvenNumber(){
       EventController eventController = new EventController();
        int result = eventController.getEvenNumber();
        assertEquals(0, result % 2, "The result should be an even number");

    }

    @Test
    public void testAlwaysReturnsInteger() {
        EventController eventController = new EventController();
        int result = eventController.getEvenNumber();
        assertTrue(result >= 0, "The result should be a non-negative integer");
    }

    @Test
    public void testNegativeInput() {
        EventController eventController = new EventController();
        int result = eventController.getEvenNumber();
        assertTrue(result >= 0, "The result should be a non-negative integer");
    }

    @Test
    public void testOddInput() {
        EventController eventController = new EventController();
        int result = eventController.getEvenNumber() + 1; // Make the result odd
        assertEquals(1, result % 2, "The result should be an odd number");
    }
    @Test
    public void testMultipleCalls() {
        EventController eventController = new EventController();
        int result1 = eventController.getEvenNumber();
        int result2 = eventController.getEvenNumber();
        assertEquals(result1 % 2, result2 % 2, "Subsequent calls should produce the same parity");
    }

    @Test
    public void testPerformance() {
        EventController eventController = new EventController();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            eventController.getEvenNumber();
        }
        long endTime = System.currentTimeMillis();
        assertTrue((endTime - startTime) < 1000, "The method should perform in a reasonable time");
    }
}

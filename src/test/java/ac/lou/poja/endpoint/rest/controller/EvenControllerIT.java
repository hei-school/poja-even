package ac.lou.poja.endpoint.rest.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EvenControllerIT {
    @Test
    public void testGenerateRandomEvenNumber() {
        EvenController evenController = new EvenController();
        int evenNumber = evenController.generateRandomEvenNumber();
        assertEquals(0, evenNumber % 2,
                "should be even number");
    }
}

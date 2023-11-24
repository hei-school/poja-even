package ac.lou.poja.endpoint.event;

import ac.lou.poja.endpoint.rest.controller.EvenController;
import  org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnvenTest {
    @Test
    public  void testGetEvenNumber(){
        EvenController evenController = new EvenController() ;
        Integer result = evenController.getEvenNumber();
            assertEquals(0, result%2);
    }
    @Test
    public void testGetEvenNumberWithinBounds() {
        EvenController evenController = new EvenController();
        Integer result = evenController.getEvenNumber();
        assertTrue(result <= Integer.MAX_VALUE);
    }
    @Test
    public void testGetEvenNumberNotNegative() {
        EvenController evenController = new EvenController();
        Integer result = evenController.getEvenNumber();
        assertTrue(result >= 0);
    }
    @Test
    public void testGetEvenNumberIsEven() {
        EvenController evenController = new EvenController();
        Integer result = evenController.getEvenNumber();
        assertEquals(0, result % 2);
    }
    @Test
    public void testGetEvenNumberGreaterThanOdd() {
        EvenController evenController = new EvenController();
        int oddNumber = 3;
        Integer result = evenController.getEvenNumber();
        assertTrue(result >= oddNumber && result % 2 == 0);
    }
    

}

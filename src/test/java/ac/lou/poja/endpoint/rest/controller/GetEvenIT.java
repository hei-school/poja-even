package ac.lou.poja.endpoint.rest.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetEvenIT {
    @Test
    public void testGetEven () {
        GetEvenController controller = new GetEvenController();
        Integer result = controller.getRandomEvenNumber();
        assertEquals(0, result % 2);
        assertNotNull(result);
        assertTrue(result < Integer.MAX_VALUE);
        assertTrue(result >= 0);
    }
}

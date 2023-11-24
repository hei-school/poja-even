package ac.lou.poja.endpoint.rest.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetEvenNumberControllerTest {

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
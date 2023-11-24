package ac.lou.poja.endpoint.rest.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EvenControllerTest {

    @Test
    void testGetEven() {
        EvenController test = new EvenController();
        assertEquals(0, test.getEven() % 2);
    }

}
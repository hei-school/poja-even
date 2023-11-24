package ac.lou.poja.endpoint.rest.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GetEvenNumberTest {

    @Test
    public void shouldGenerateRandomEvenNumber() {
        GetEvenNumber getEvenNumber = new GetEvenNumber();
        int evenNumber = getEvenNumber.generateRandomEvenNumber();
        assertTrue(evenNumber % 2 == 0, "Generated number is not even");
    }

    @Test
    public void shouldReturnEvenNumberFromEndpoint() {
        GetEvenNumber getEvenNumber = new GetEvenNumber();
        int evenNumber = getEvenNumber.getEvenNumber().getBody();
        assertTrue(evenNumber % 2 == 0, "Returned number from endpoint is not even");
    }

    @Test
    public void shouldGenerateNumberLessThanMaxValue() {
        GetEvenNumber getEvenNumber = new GetEvenNumber();
        int evenNumber = getEvenNumber.generateRandomEvenNumber();
        assertTrue(evenNumber < Integer.MAX_VALUE, "Generated number is not less than Integer.MAX_VALUE");
    }

    @Test
    public void shouldGenerateEvenNumberAfterMultipleCalls() {
        GetEvenNumber getEvenNumber = new GetEvenNumber();
        for (int i = 0; i < 10; i++) {
            int evenNumber = getEvenNumber.generateRandomEvenNumber();
            assertTrue(evenNumber % 2 == 0, "Generated number is not even after multiple calls");
        }
    }
}

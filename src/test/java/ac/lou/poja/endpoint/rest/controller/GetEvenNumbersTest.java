package com.company.base.endpoint.rest.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GetEvenNumberTest {

    @Test
    public void testGenerateRandomEvenNumber() {
        GetEvenNumber getEvenNumber = new GetEvenNumber();
        int evenNumber = getEvenNumber.generateRandomEvenNumber();
        assertTrue(evenNumber % 2 == 0, "Generated number is not even");
    }

    @Test
    public void testGetEvenNumberEndpoint() {
        GetEvenNumber getEvenNumber = new GetEvenNumber();
        int evenNumber = getEvenNumber.getEvenNumber().getBody();
        assertTrue(evenNumber % 2 == 0, "Returned number from endpoint is not even");
    }

    @Test
    public void testAdditionalScenario() {
        GetEvenNumber getEvenNumber = new GetEvenNumber();
        int evenNumber = getEvenNumber.generateRandomEvenNumber();
        assertTrue(evenNumber < Integer.MAX_VALUE, "Generated number is not less than Integer.MAX_VALUE");

        for (int i = 0; i < 10; i++) {
            evenNumber = getEvenNumber.generateRandomEvenNumber();
            assertTrue(evenNumber % 2 == 0, "Generated number is not even after multiple calls");
        }
    }
}

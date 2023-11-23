package ac.lou.poja.endpoint.rest.controller;

import org.junit.Assert;
import org.junit.Test;


public class TestOfEven {
    @Test
    public void testOfEven() {
        int evenNumber = EventNumberController.getEven();
        Assert.assertEquals("Test successful", 0, evenNumber % 2);
    }
}

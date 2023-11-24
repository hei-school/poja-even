package ac.lou.poja.endpoint.rest.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetEvenTest {
    @Test
    void even(){assertTrue("test passé", GetEven.getEven() % 2 == 0);}
}

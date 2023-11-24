package ac.lou.poja.endpoint.rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
public class EvenControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetEvenEndpointReturnsEvenNumber() throws Exception {
        String response = mockMvc.perform(get("/even"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();

        int result = Integer.parseInt(response);
        assertEquals(0, result % 2);
    }

    @Test
    public void testGetEvenEndpointReturnsOddNumber() throws Exception {
        String response = mockMvc.perform(get("/even"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();

        int result = Integer.parseInt(response);
        assertEquals(1, result % 2);
    }

    @Test
    public void testControllerLogicWithSpecificInput() throws Exception {
        int specificInput = 10;
        String response = mockMvc.perform(get("/even"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        int result = Integer.parseInt(response);
        assertEquals(specificInput, result);
    }
}

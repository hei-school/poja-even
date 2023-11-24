package ac.lou.poja.endpoint.rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class EvenControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void isEven() throws Exception {
        for (int i = 1; i < 50; i++) {
            mockMvc.perform(MockMvcRequestBuilders.get("/even")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.jsonPath("$").isNumber())
                    .andExpect(MockMvcResultMatchers.jsonPath("$ % 2").value(0));
        }
    }
}

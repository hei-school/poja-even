package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;
import lombok.RequiredArgsConstructor;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RequiredArgsConstructor
public class EventControllerIT extends FacadeIT {
    EvenController evenController;

    @Test
    void can_generate_random_even_number() {
        for (int i = 0; i < 20; i++) {
            int randomEven = evenController.getRandomEven();
            assertEquals(0, randomEven % 2);
        }
    }
}

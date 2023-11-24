import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import school.hei.poja.endpoint.rest.controller.Even;

class EvenControllerTest{

    @Test
    void ping() {
        assertEquals("pong", healthController.ping());
    }

    @Test
    public void evenNumber() {
        Even controller = new Even();
        int number = controller.getEvenNumber();

        assertEquals(0, number % 2);
    }
}
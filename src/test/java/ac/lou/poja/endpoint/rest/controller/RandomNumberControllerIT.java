package ac.lou.poja.endpoint.rest.controller;

import ac.lou.poja.conf.FacadeIT;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomNumberControllerIT extends FacadeIT {

    @Autowired RandomNumberController randomNumberController;

    @Test
    void getRandomNumber_test() {
        for (int i = 0; i < 100; i++) {
            assertEquals(0, randomNumberController.getEven() % 2);
        }
        }
    }

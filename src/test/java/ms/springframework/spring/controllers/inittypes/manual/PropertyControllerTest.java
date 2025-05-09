package ms.springframework.spring.controllers.inittypes.manual;

import ms.springframework.spring.services.initypes.PropertyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyControllerTest {

  PropertyController controller;

  @BeforeEach
  void setUp() {
    controller = new PropertyController();
    controller.greetingService = new PropertyService();
  }

  @Test
  void test() {
    System.out.println(controller.sayGreeting());
  }
}
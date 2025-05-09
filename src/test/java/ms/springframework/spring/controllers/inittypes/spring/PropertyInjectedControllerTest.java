package ms.springframework.spring.controllers.inittypes.spring;

import ms.springframework.spring.services.initypes.PropertyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

  PropertyInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new PropertyInjectedController();
    controller.greetingService = new PropertyService();
  }

  @Test
  void test() {
    System.out.println(controller.sayGreeting());
  }
}
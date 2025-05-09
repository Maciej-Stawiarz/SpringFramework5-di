package ms.springframework.spring.controllers.inittypes.spring;

import ms.springframework.spring.services.initypes.SetterService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

  SetterInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new SetterInjectedController();
    controller.setGreetingService(new SetterService());
  }

  @Test
  void test() {
    System.out.println(controller.sayGreeting());
  }
}
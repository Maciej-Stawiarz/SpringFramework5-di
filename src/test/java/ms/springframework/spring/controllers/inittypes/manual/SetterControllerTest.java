package ms.springframework.spring.controllers.inittypes.manual;

import ms.springframework.spring.services.initypes.SetterService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterControllerTest {

  SetterController controller;

  @BeforeEach
  void setUp() {
    controller = new SetterController();
    controller.setGreetingService(new SetterService());
  }

  @Test
  void test() {
    System.out.println(controller.sayGreeting());
  }
}
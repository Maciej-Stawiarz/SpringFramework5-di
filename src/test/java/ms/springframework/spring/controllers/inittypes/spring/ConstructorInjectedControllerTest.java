package ms.springframework.spring.controllers.inittypes.spring;

import ms.springframework.spring.services.initypes.ConstructorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

  ConstructorInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new ConstructorInjectedController(new ConstructorService());
  }

  @Test
  void test() {
    System.out.println(controller.sayGreeting());
  }
}
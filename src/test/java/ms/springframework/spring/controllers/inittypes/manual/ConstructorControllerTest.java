package ms.springframework.spring.controllers.inittypes.manual;

import ms.springframework.spring.services.initypes.ConstructorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorControllerTest {

  ConstructorController controller;

  @BeforeEach
  void setUp() {
    controller = new ConstructorController(new ConstructorService());
  }

  @Test
  void test() {
    System.out.println(controller.sayGreeting());
  }
}

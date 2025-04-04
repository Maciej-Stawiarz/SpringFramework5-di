package ms.springframework.SpringFramework5_di.controllers;

import ms.springframework.SpringFramework5_di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

  SetterInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new SetterInjectedController();
    controller.setGreetingService(new ConstructorGreetingService());
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}
package ms.springframework.SpringFramework5_di.controllers;

import ms.springframework.SpringFramework5_di.services.GreetingService;

public class ConstructorInjectedController {

  private final GreetingService greetingService;

  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreetings();
  }
}

package ms.springframework.SpringFramework5_di.controllers;

import ms.springframework.SpringFramework5_di.services.GreetingService;

public class PropertyInjectedController {

  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreetings();
  }
}
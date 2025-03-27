package ms.springframework.SpringFramework5_di.controllers;

import ms.springframework.SpringFramework5_di.services.GreetingService;

public class SetterInjectedController {

  private GreetingService greetingService;

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreetings();
  }


}
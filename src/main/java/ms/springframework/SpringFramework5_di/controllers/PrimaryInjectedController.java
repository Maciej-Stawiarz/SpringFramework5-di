package ms.springframework.SpringFramework5_di.controllers;

import ms.springframework.SpringFramework5_di.services.GreetingService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimaryInjectedController {

  private final GreetingService greetingService;

  public PrimaryInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting()
  {
    return greetingService.sayGreetings();
  }
}
package ms.springframework.SpringFramework5_di.controllers;

import ms.springframework.SpringFramework5_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

  private final GreetingService greetingService;

  public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreetings();
  }
}

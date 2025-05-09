package ms.springframework.spring.controllers.inittypes.manual;

import ms.springframework.spring.controllers.ControllerAPI;
import ms.springframework.spring.services.GreetingService;

public class ConstructorController implements ControllerAPI {

  private final GreetingService greetingService;

  public ConstructorController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @Override
  public String sayGreeting() {
    return greetingService.sayGreeting();
  }
}
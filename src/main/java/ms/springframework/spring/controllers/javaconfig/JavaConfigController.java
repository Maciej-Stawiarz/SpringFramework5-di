package ms.springframework.spring.controllers.javaconfig;

import ms.springframework.spring.controllers.ControllerAPI;
import ms.springframework.spring.services.GreetingService;

public class JavaConfigController implements ControllerAPI {

  private final GreetingService greetingService;

  public JavaConfigController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @Override
  public String sayGreeting() {
    return greetingService.sayGreeting();
  }
}
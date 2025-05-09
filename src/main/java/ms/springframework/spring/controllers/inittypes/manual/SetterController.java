package ms.springframework.spring.controllers.inittypes.manual;

import ms.springframework.spring.controllers.ControllerAPI;
import ms.springframework.spring.services.GreetingService;

public class SetterController implements ControllerAPI {

  private GreetingService greetingService;

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @Override
  public String sayGreeting() {
    return greetingService.sayGreeting();
  }
}

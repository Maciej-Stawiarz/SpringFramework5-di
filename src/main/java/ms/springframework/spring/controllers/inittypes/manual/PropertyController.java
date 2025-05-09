package ms.springframework.spring.controllers.inittypes.manual;

import ms.springframework.spring.controllers.ControllerAPI;
import ms.springframework.spring.services.GreetingService;

public class PropertyController implements ControllerAPI {

  public GreetingService greetingService;

  @Override
  public String sayGreeting() {
    return greetingService.sayGreeting();
  }
}

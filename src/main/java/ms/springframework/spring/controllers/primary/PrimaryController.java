package ms.springframework.spring.controllers.primary;

import ms.springframework.spring.controllers.ControllerAPI;
import ms.springframework.spring.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController implements ControllerAPI {

  private final GreetingService greetingService;

  public PrimaryController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @Override
  public String sayGreeting() {
    return greetingService.sayGreeting();
  }
}

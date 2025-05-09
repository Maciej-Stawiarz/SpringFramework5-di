package ms.springframework.spring.controllers.inittypes.spring;

import ms.springframework.spring.controllers.ControllerAPI;
import ms.springframework.spring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class SetterInjectedController implements ControllerAPI {

  private GreetingService greetingService;

  @Autowired
  @Qualifier("setterService")
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @Override
  public String sayGreeting() {
    return greetingService.sayGreeting();
  }
}
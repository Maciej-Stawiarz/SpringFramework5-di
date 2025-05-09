package ms.springframework.spring.controllers.profiles;

import ms.springframework.spring.controllers.ControllerAPI;
import ms.springframework.spring.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class LanguageController implements ControllerAPI {

  private final GreetingService greetingService;

  public LanguageController(@Qualifier("languageService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @Override
  public String sayGreeting() {
    return greetingService.sayGreeting();
  }
}

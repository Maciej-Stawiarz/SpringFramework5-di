package ms.springframework.SpringFramework5_di.controllers;

import ms.springframework.SpringFramework5_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

  private GreetingService greetingService;


  @Autowired
  @Qualifier("setterGreetingService")
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreetings();
  }
}
package ms.springframework.spring.services.javaconfig;

import ms.springframework.spring.services.GreetingService;

public class JavaConfigService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Java config service";
  }
}
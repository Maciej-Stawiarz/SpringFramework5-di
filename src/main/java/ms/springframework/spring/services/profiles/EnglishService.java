package ms.springframework.spring.services.profiles;

import ms.springframework.spring.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("languageService")
@Profile({"EN", "default"})
public class EnglishService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "English service";
  }
}

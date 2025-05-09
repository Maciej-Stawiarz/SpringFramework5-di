package ms.springframework.spring.services.profiles;

import ms.springframework.spring.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("languageService")
@Profile({"GE"})
public class GermanService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "German service";
  }
}

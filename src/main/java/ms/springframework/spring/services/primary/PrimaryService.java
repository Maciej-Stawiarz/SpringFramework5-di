package ms.springframework.spring.services.primary;

import ms.springframework.spring.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Primary service";
  }
}

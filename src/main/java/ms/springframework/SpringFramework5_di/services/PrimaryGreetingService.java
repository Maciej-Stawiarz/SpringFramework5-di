package ms.springframework.SpringFramework5_di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

  @Override
  public String sayGreetings() {
    return "Hello World - Primary";
  }
}
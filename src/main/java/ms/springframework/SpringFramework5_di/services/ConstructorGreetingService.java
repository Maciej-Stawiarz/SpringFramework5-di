package ms.springframework.SpringFramework5_di.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

  @Override
  public String sayGreetings() {
    return "Hello World - Constructor";
  }
}
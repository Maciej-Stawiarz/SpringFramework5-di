package ms.springframework.SpringFramework5_di.services;

public class GreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreetings() {
    return "Hello Worlds";
  }
}
package ms.springframework.spring.controllers.inittypes.spring;

import ms.springframework.spring.controllers.ControllerAPI;
import ms.springframework.spring.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController implements ControllerAPI {

    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}

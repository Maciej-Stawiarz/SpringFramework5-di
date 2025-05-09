package ms.springframework.spring.controllers.inittypes.spring;

import ms.springframework.spring.controllers.ControllerAPI;
import ms.springframework.spring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController implements ControllerAPI {

    @Autowired
    @Qualifier("propertyService")
    public GreetingService greetingService;

    @Override
    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
package ms.springframework.spring.controllers.componentscan;

import ms.springframework.componentscan.ComponentScanService;
import ms.springframework.spring.controllers.ControllerAPI;
import org.springframework.stereotype.Controller;

@Controller
public class ComponentScanController implements ControllerAPI {

    private final ComponentScanService componentScanService;

    public ComponentScanController(ComponentScanService componentScanService) {
        this.componentScanService = componentScanService;
    }

    @Override
    public String sayGreeting() {
        return componentScanService.sayGreeting();
    }
}

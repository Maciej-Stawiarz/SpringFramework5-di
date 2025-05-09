package ms.springframework.componentscan;

import org.springframework.stereotype.Service;

@Service
public class ComponentScanService {

    public String sayGreeting() {
        return "Component scan service";
    }
}
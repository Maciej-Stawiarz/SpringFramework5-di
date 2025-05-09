package ms.springframework.spring.services.initypes;

import ms.springframework.spring.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Property init type";
    }
}

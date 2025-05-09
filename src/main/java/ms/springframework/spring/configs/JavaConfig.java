package ms.springframework.spring.configs;

import ms.springframework.spring.controllers.javaconfig.JavaConfigController;
import ms.springframework.spring.services.javaconfig.JavaConfigService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

  @Bean
  JavaConfigController javaConfigController() {
    return new JavaConfigController(new JavaConfigService());
  }

  @Bean
  JavaConfigService javaConfigService() {
    return new JavaConfigService();
  }
}
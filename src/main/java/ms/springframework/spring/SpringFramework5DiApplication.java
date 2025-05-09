package ms.springframework.spring;

import ms.springframework.spring.controllers.componentscan.ComponentScanController;
import ms.springframework.spring.controllers.inittypes.manual.ConstructorController;
import ms.springframework.spring.controllers.inittypes.manual.PropertyController;
import ms.springframework.spring.controllers.inittypes.manual.SetterController;
import ms.springframework.spring.controllers.inittypes.spring.ConstructorInjectedController;
import ms.springframework.spring.controllers.inittypes.spring.PropertyInjectedController;
import ms.springframework.spring.controllers.inittypes.spring.SetterInjectedController;
import ms.springframework.spring.controllers.javaconfig.JavaConfigController;
import ms.springframework.spring.controllers.primary.PrimaryController;
import ms.springframework.spring.controllers.profiles.LanguageController;
import ms.springframework.spring.services.initypes.ConstructorService;
import ms.springframework.spring.services.initypes.PropertyService;
import ms.springframework.spring.services.initypes.SetterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
		"ms.springframework.componentscan",
		"ms.springframework.spring"})
@SpringBootApplication
public class SpringFramework5DiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication
				.run(SpringFramework5DiApplication.class, args);

		System.out.println("\n--- Different types of initialization of classes ---");
		System.out.println("--- Types 1 - 3 are not in the spring context, since they are not beans (They don't have annotations on them). ---");
		System.out.println("--- Type 1: Manually through constructor ---");
		ConstructorController constructorController = new ConstructorController(new ConstructorService());
		System.out.println(constructorController.sayGreeting());
		System.out.println("--- Type 2: Manually through setter ---");
		SetterController setterController = new SetterController();
		setterController.setGreetingService(new SetterService());
		System.out.println(setterController.sayGreeting());
		System.out.println("--- Type 3: Manually through property ---");
		PropertyController propertyController = new PropertyController();
		propertyController.greetingService = new PropertyService();
		System.out.println(propertyController.sayGreeting());
		System.out.println("--- Types 4 - 6 are beans so we don't have to initialize them but just fetch them from spring context. ---");
		System.out.println("--- Type 4: Automatically through constructor ---");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.sayGreeting());
		System.out.println("--- Type 5: Automatically through setter ---");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.sayGreeting());
		System.out.println("--- Type 6: Automatically through property ---");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.sayGreeting());



		System.out.println("\n--- Different service initialized depending on the profiles ---");
		System.out.println("--- Type 1: English, profiles - EN, default ---");
		System.out.println("--- Type 2: German, profiles - GE ---");
		LanguageController languageController = (LanguageController) context.getBean("languageController");
		System.out.println(languageController.sayGreeting());



		System.out.println("\n--- Primary annotation ---");
		PrimaryController primaryController = (PrimaryController) context.getBean("primaryController");
		System.out.println(primaryController.sayGreeting());



		System.out.println("\n--- Component scan annotation ---");
		ComponentScanController componentScanController = (ComponentScanController) context.getBean("componentScanController");
		System.out.println(componentScanController.sayGreeting());



		System.out.println("\n--- Java config ---");
		JavaConfigController javaConfigController = (JavaConfigController) context.getBean("javaConfigController");
		System.out.println(javaConfigController.sayGreeting());
	}
}
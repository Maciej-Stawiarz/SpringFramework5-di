package ms.springframework.SpringFramework5_di;

import ms.springframework.SpringFramework5_di.controllers.ConstructorInjectedController;
import ms.springframework.SpringFramework5_di.controllers.PrimaryInjectedController;
import ms.springframework.SpringFramework5_di.controllers.PropertyInjectedController;
import ms.springframework.SpringFramework5_di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFramework5DiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication
				.run(SpringFramework5DiApplication.class, args);

		System.out.println("-----------------Primary");
		PrimaryInjectedController primaryInjectedController = (PrimaryInjectedController) context.getBean("primaryInjectedController");
		System.out.println(primaryInjectedController.getGreeting());

		System.out.println("-----------------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-----------------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----------------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}
}
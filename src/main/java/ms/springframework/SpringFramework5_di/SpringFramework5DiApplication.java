package ms.springframework.SpringFramework5_di;

import ms.springframework.SpringFramework5_di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFramework5DiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication
				.run(SpringFramework5DiApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}
}
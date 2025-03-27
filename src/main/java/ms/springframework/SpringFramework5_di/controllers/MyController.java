package ms.springframework.SpringFramework5_di.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @GetMapping
  public String sayHello() {
    System.out.println("Hello World");

    return "Hello World!";
  }
}
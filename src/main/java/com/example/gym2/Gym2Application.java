package com.example.gym2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Gym2Application {

	public static void main(String[] args) {
		SpringApplication.run(Gym2Application.class, args);
	}


}
@RestController
class HelloController {
	@GetMapping("/")
	public String hello() {
		return "CI/CD is working";
	}
}


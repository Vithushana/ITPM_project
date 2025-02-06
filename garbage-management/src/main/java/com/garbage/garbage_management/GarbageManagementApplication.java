package com.garbage.garbage_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController // This makes the class a REST controller
public class GarbageManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarbageManagementApplication.class, args);
	}

	@GetMapping("/hello") // This maps the URL "/hello" to this method
    public String sayHello() {
        return "Hello, Spring Boot!";
    }

}

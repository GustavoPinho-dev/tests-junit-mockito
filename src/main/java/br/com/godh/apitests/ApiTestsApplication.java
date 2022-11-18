package br.com.godh.apitests;

import br.com.godh.apitests.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiTestsApplication.class, args);

		User user = new User(1, "Gustavo", "email@email.com", "1234567890");

	}

}

package com.codependent.keyclockdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@SpringBootApplication
public class KeycloakSpringSecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakSpringSecurityDemoApplication.class, args);
	}

	@GetMapping(path = "/me")
	public String me(Principal principal) {
		return principal.getName();
	}
}

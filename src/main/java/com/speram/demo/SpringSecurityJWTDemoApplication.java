package com.speram.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityJWTDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJWTDemoApplication.class, args);
	}

	/*@Bean
	CommandLineRunner clr(final UserService userService){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				userService.saveRole(new Role(null, "USER"));
				userService.saveRole(new Role(null, "ADMIN"));

				userService.saveUser(new User(null, "sivateja", "password", new ArrayList<>()));

				userService.addRoleToUser("sivateja", "USER");
			}
		};
	}*/
}

package com.rvmagrini.springbootapi.user;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(UserRepository repository) {
		return args -> {
			User marie = new User(
						"Marie", 
						"marie@gmail.com", 
						LocalDate.of(2000, Month.JANUARY, 12)
						);
			
			User john = new User(
					"John", 
					"john@gmail.com", 
					LocalDate.of(2005, Month.APRIL, 03)
					);
			
			repository.saveAll(
					List.of(marie, john));
					
		};
	}

}

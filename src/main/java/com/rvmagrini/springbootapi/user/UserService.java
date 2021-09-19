package com.rvmagrini.springbootapi.user;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;


// This annotation defines that this class has to be instantiated by @Autowired elsewhere
@Service
public class UserService {
	
	public List<User> getUsers() {
		return List.of(
				new User("Marie", 
						"marie@gmail.com", 
						LocalDate.of(2000, Month.JANUARY, 12),
						21
						)
				);
	}

}

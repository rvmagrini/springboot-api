package com.rvmagrini.springbootapi.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// This annotation defines that this class has to be instantiated by @Autowired elsewhere
@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}

}

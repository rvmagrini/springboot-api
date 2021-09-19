package com.rvmagrini.springbootapi.user;

import java.util.List;
import java.util.Optional;

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
	
	public void addNewUser(User user) {
		System.out.println(user);
		Optional<User> userOptional = userRepository.findUserByEmail(user.getEmail());
		if (userOptional.isPresent()) {
			throw new IllegalStateException("Email already taken.");
		}
		userRepository.save(user);
	}

	public void deleteUser(Long userId) {
		boolean userExists = userRepository.existsById(userId);
		if (!userExists) {
			throw new IllegalStateException("User does not exist.");
		}
		userRepository.deleteById(userId);
	}

}

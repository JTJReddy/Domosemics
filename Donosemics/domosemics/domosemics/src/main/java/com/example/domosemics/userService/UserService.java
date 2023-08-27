package com.example.domosemics.userService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domosemics.repository.UserRepository;
import com.example.domosemics.user.User;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}
	
	public User createuser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> getAllUsers() {
	    return userRepository.findAll();
	}

	public User getUserById(Long id) {
	    return userRepository.findById(id).orElse(null);
	}

	public void updateUser(User user) {
	    userRepository.save(user);
	}

	public void deleteUser(Long id) {
	    userRepository.deleteById(id);
	}
}

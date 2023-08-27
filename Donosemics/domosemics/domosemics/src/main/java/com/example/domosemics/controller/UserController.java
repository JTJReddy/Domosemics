package com.example.domosemics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domosemics.user.User;
import com.example.domosemics.userService.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	  private final UserService userService;

	    @Autowired
	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    @PostMapping
	    public User createUser(@RequestBody User user) {
	        return userService.createuser(user);
	    }

	    @GetMapping
	    public List<User> getAllUsers() {
	        return userService.getAllUsers();
	    }

	    @GetMapping("/{id}")
	    public User getUserById(@PathVariable Long id) {
	        return userService.getUserById(id);
	    }

	    @PutMapping("/{id}")
	    public void updateUser(@PathVariable Long id, @RequestBody User user) {
	        User existingUser = userService.getUserById(id);
	        if (existingUser != null) {
	            user.setId(id);
	            userService.updateUser(user);
	        }
	    }

	    @DeleteMapping("/{id}")
	    public void deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	    }

}

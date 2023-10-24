package com.fmj.followmyjob.user.controllers;

import com.fmj.followmyjob.user.models.User;
import com.fmj.followmyjob.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public User saveOne(@RequestBody User user) {
		return this.userService.saveOne(user);
	}
	
	@GetMapping("/user/{userId}")
	public User findById(@PathVariable( name = "userId") Long userId) {
		return this.userService.findById(userId);
	}
	
	@GetMapping("/user")
	public List<User> findAll() {
		return this.userService.findAll();
	}
	
	public User deleteById(Long userId) {
		return this.userService.deleteById(userId);
	}
}

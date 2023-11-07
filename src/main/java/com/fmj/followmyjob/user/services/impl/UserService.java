package com.fmj.followmyjob.user.services.impl;

import com.fmj.followmyjob.user.entity.User;
import com.fmj.followmyjob.user.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User saveOne(User user) {
		return this.userRepository.save(user);
	}
	
	public User findById(Long userId) {
		return this.userRepository.findById(userId).orElse(null);
	}
	
	public List<User> findAll() {
		return this.userRepository.findAll();
	}
	
	public User deleteById(Long userId) {
		User user = this.userRepository.findById(userId).orElse(null);
		this.userRepository.deleteById(userId);
		return user;
	}
}

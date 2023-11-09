package com.fmj.followmyjob.user.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmj.followmyjob.user.entity.User;
import com.fmj.followmyjob.user.respository.UserRepository;
import com.fmj.followmyjob.user.services.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return (List<User>) this.userRepository.findAll();
	}

	@Override
	public Optional<User> findById(UUID userId) {
		return this.userRepository.findById(userId);
	}

	@Override
	public boolean existsById(UUID userId) {
		return this.userRepository.existsById(userId);
	}

	@Override
	public void save(User user) {
		this.userRepository.save(user);
	}

	@Override
	public void deleteById(UUID userId) {
		this.userRepository.deleteById(userId);
	}

	@Override
	public Optional<User> findByName(String name) {
		return this.userRepository.findUserByNameIgnoreCase(name);
	}
}

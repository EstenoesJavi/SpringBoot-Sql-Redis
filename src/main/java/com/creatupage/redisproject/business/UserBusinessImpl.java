package com.creatupage.redisproject.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.creatupage.redisproject.model.User;
import com.creatupage.redisproject.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserBusinessImpl implements UserBusiness {

	private final UserRepository userRepository;
	
	@Override
	public User create(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

}

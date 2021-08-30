package com.creatupage.redisproject.business;

import java.util.List;

import com.creatupage.redisproject.model.User;

public interface UserBusiness {

	User create(User user);
	List<User> getAll();
}

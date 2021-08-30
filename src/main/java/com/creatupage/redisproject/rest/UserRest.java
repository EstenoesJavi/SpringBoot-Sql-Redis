package com.creatupage.redisproject.rest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creatupage.redisproject.business.UserBusiness;
import com.creatupage.redisproject.model.User;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user")
@Slf4j
public class UserRest {

	private final UserBusiness userBusiness;
	
	@PostMapping
	@CacheEvict(value = {"usuarios"},allEntries = true)
	public User createUser(@RequestBody User user){
		log.info("Creando usuario");
		//User user1 = User.builder().name("Criss").lastName("Arango").Age(11).birthDate(LocalDate.now()).state(false).build();
		User userCreated = userBusiness.create(user);
		
		return userCreated;
	}
	
	@GetMapping
	@Cacheable(cacheNames = {"usuarios"})
	public List<User> getUsers(){
		log.info("Listando usuarios");
		List<User> userList = userBusiness.getAll();
		
		return userList;
	}
}

package com.creatupage.redisproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.creatupage.redisproject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}

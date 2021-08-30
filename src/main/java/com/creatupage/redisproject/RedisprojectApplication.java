package com.creatupage.redisproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableScheduling
public class RedisprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisprojectApplication.class, args);
		log.info("Acá arrancando ejejej");
	}

}

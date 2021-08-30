package com.creatupage.redisproject.task;

import java.time.LocalDate;

import org.springframework.cache.CacheManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequiredArgsConstructor
public class ClearCache {

	private final CacheManager cacheManager;

	@Scheduled(fixedRate = 8000)
	public void clear() {
		log.info("Limpiando cache. " + LocalDate.now());
		cacheManager.getCache("usuarios").clear();
	}
}

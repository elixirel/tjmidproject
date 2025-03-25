package com.tjoeun.midproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import com.tjoeun.midproject.dto.UserDTO;

@Configuration
public class RootAppContext {

	@Bean("UserDTO")
	@SessionScope
	public UserDTO userDTO() {
		return new UserDTO();
	}
}

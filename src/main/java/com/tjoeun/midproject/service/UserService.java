package com.tjoeun.midproject.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tjoeun.midproject.dao.UserDAO;
import com.tjoeun.midproject.dto.UserDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserDAO userDAO;
	
	@Resource(name = "UserDTO")
	private UserDTO userDTO;
	
	public void userJoin(UserDTO userDTO) {
		userDAO.addUser(userDTO);
	}
}

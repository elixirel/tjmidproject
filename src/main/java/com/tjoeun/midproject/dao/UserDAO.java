package com.tjoeun.midproject.dao;

import org.springframework.stereotype.Repository;

import com.tjoeun.midproject.dto.UserDTO;
import com.tjoeun.midproject.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserDAO {
	private final UserMapper userMapper;
	
	public void addUser(UserDTO userDTO) {
		userMapper.addUser(userDTO);
	}
}

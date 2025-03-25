package com.tjoeun.midproject.dto;

import lombok.Data;

@Data
public class UserDTO {
	private int idx;
	private String name;
	private String id;
	private String password;
	private String password2;
	private String username;
	private int role;

	private boolean userIdExist;
}

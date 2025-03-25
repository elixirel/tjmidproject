package com.tjoeun.midproject.dto;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserDTO {
	private int idx;
	@Size(min = 2, max = 4)
	@Pattern(regexp = "[가-힣]*")
	private String name;
	
	@Size(min = 8, max = 20)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String id;
	
	@Size(min = 8, max = 20)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String password;
	
	@Size(min = 8, max = 20)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String password2;
	
	@Size(min = 1, max = 7)
	@Pattern(regexp = "[a-zA-Z0-9가-힣]*")
	private String username;
	
	private int role;

	private boolean userIdExist;
}

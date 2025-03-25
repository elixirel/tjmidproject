package com.tjoeun.midproject.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.tjoeun.midproject.dto.UserDTO;

public interface UserMapper {
	// 회원 가입 여부 조회하기
	@Select("Select name idx from user where id = #{id}")
	String checkUserId(String id);
	
	// 회원 가입하기
	@Insert("Insert into user(name, id, password, username, role) " +
			"values (" +
			"#{name}, #{id}, #{password}, #{username}, #{role})")
	void addUser(UserDTO userDTO);
	
	// 로그인 성공했을 때, 회원 정보 가져오기
	//  ㄴ 가져와서, Spring Framework 가  Session Scope 에
	//     서버 실행할 때 자동으로 생성해 놓은 UserDTO 에 
	//     로그인한 회원의 정보를 위함 
	@Select("Select * from user where id = #{id} and password = #{password}")
	UserDTO getLoginUserInfo(UserDTO userDTO);
	
	// user index로 유저 정보 가져오기
	@Select("Select * from user where idx = #{idx}")
	UserDTO getUserInfo(int idx);
	
	// user 정보 수정
	@Update("Update user set " +
			"password = #{password}, " +
			"username = #{username} " +
			"where idx = #{idx}")
	void userUpdate(UserDTO userDTO);
}

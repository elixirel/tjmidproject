package com.tjoeun.midproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tjoeun.midproject.dto.UserDTO;
import com.tjoeun.midproject.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	
	@GetMapping("/login")
	public String login(@ModelAttribute("UserDTO") UserDTO userDTO) {
		return "user/login";
	}
	
	@GetMapping("/join")
	public String join(@ModelAttribute("UserDTO") UserDTO userDTO) {
		return "user/join";
	}
	
	@GetMapping("/modify")
	public String modify(@ModelAttribute("UserDTO") UserDTO userDTO) {
		return "user/modify";
	}
	
	@PostMapping("/join_procedure")
	public String joinProcedure(@ModelAttribute("UserDTO") UserDTO userDTO, BindingResult result) {
		if(result.hasErrors()) return "user/login";
		userService.userJoin(userDTO);
		return "user/join_success";
		
	}
}

package com.tjoeun.midproject.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tjoeun.midproject.dto.UserDTO;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
	
	
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
}

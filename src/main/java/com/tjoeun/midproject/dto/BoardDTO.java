package com.tjoeun.midproject.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class BoardDTO {
	private int board_id;
	private String title;
	private String content;
	private int user;
	private MultipartFile uploadFile;
	private String file;
}

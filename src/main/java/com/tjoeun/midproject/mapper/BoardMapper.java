package com.tjoeun.midproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import com.tjoeun.midproject.dto.BoardDTO;

public interface BoardMapper {

	@Insert("insert into board(board_id, title, content, user, file) " + 
			"values (" +
			"#{board_id}, #{title}, #{content}, #{user}, #{file, jdbcType=VARCHAR}")
	void addBoard(BoardDTO boardWriteDTO);
	
	// board/main.jsp 화면이 보일 때
	// 회원이 입력한 글의 정보(글번호	제목	작성자	작성날짜)를	
	// DB table 에서 가져와서 보여주기
	@Select("select * from v_board_user where user = #{user_id} " +
			"order by idx desc")
	List<BoardDTO> getBoardList(int user_id, RowBounds rowBounds);
	
	// 상세페이지에서 작성한 글 내용을 화면에 보여주기 위한 SQL
		// DB 에서 게시글의 정보를 가져올 때 user 도 가져와서
		// 현재 로그인한 회원에 정보(Session Scope 에 있음)의 idx 와 비교해서
		// 같으면, 글쓴이와 로그인한 회원이 같은 사람임
	@Select("Select * from v_board_user where idx = #{idx}")
	BoardDTO getBoard(int idx);
	
	// 게시글 수정하기
	@Update("update board set " +
			"title = #{title}, " +
			"content = #{content}, " +
			"file = #{file, jdbcType=VARCHAR} " +
			"where idx = #{idx}")
	void updateBoard(BoardDTO boardDTO);
	
	// 게시글 삭제하기
	@Delete("Delete from board " +
			"where idx = #{idx}")
	void deleteBoard(int idx);
	
	// 각 게시판의 전체 게시글 개수 가져오기
	@Select("Select count(*) from board " +
			"where board_id = #{board_id}")
	int getBoardCount(int board_id);
	

}

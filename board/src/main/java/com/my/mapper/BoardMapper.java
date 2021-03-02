package com.my.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Configuration;

import com.my.domain.BoardVO;

public interface BoardMapper {

	public List<BoardVO> getBoardList();
	
	public String getNumber();
	
	public int register(BoardVO bvo);
	
	public BoardVO showDetail(String bno);
	
	public int updateBoard(BoardVO bvo);
	
	public int deleteBoard(String bno);
	
} //end of BoardMapper

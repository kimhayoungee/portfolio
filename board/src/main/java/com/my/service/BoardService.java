package com.my.service;

import java.util.List;

import com.my.domain.BoardVO;
import com.my.domain.Criteria;

public interface BoardService {

//	public List<BoardVO> getList();

	public List<BoardVO> getList(Criteria cri);
	
	public void register(BoardVO bvo);
	
	public BoardVO showDetail(String bno);
	
	public int editBoard(BoardVO bvo);
	
	public int removeBoard(String bno);
	
	public int getTotal(Criteria cri);
}

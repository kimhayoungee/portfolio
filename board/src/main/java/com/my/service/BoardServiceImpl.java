package com.my.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.domain.BoardVO;
import com.my.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
//@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		log.info("서비스 getList");
		
		return mapper.selectWholeList();
	}

	@Override
	public void register(BoardVO bvo) {
		// TODO Auto-generated method stub
		log.info("서비스 register " + bvo);
		
		bvo.setBno(mapper.getNumber()); //채번
		mapper.insertBoard(bvo);
		
	}

	@Override
	public BoardVO showDetail(String bno) {
		// TODO Auto-generated method stub
		log.info("서비스 showDetail " + bno);
		
		return mapper.selectDetail(bno);
	}

	@Override
	public int editBoard(BoardVO bvo) {
		// TODO Auto-generated method stub
		log.info("서비스  editBoard " +bvo);
		
		return mapper.updateBoard(bvo);
	}

	@Override
	public int removeBoard(String bno) {
		// TODO Auto-generated method stub
		log.info("서비스 removeBoard " + bno);
		
		return mapper.deleteBoard(bno);
	}

}

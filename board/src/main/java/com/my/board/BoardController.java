package com.my.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {

	@GetMapping("/getBoardList")
	public void boardlist() {
		log.info("글목록");
		
	}
	
	@PostMapping("/goBoardRegister")
	public void boardregister() {
		
	}
	
	
	
} // end of BoardController
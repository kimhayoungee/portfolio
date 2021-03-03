package com.my.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.my.domain.BoardVO;
import com.my.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {

		@Autowired
		private BoardService service;
		
		@GetMapping("/getList")
		public String getList(Model model) {			
			log.info("컨트롤러 getList");
			
			model.addAttribute("boardList", service.getList());
			return "board/list";
		}
		
		@PostMapping("/register")
		public String register(BoardVO bvo, RedirectAttributes ra) {
			log.info("컨트롤러 register " + bvo);
			
			service.register(bvo);
			ra.addFlashAttribute("result", bvo.getBno());
			
			return "redirect:/board/getList";
		}
		
		@GetMapping("/showDetail")
		public void showDetail(@RequestParam("bno") String bno, Model model) {
			log.info("컨트롤러 showDetail " + bno);
			
			model.addAttribute("bvo", service.showDetail(bno));
		}		
	
		@PostMapping("/editBoard")
		public String editBoard(BoardVO bvo, RedirectAttributes ra) {
			log.info("컨트롤러 editBoard " + bvo);
			
			if(service.editBoard(bvo)==1) {
				ra.addFlashAttribute("result", "성공");
			}
			
			return "redirect:/board/getList";
		}
	
		@PostMapping("/removeBoard")
		public String removeBoard(@RequestParam("bno") String bno, RedirectAttributes ra) {
			log.info("컨트롤러 removeBoard " + bno);
			
			if(service.removeBoard(bno)==1) {
				ra.addFlashAttribute("result", "성공");
			}
			
			return "redirect:/board/getList";
		}
} // end of BoardController
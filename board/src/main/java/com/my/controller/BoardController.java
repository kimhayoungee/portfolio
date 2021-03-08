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
import com.my.domain.PageVO;
import com.my.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {

		@Autowired
		private BoardService service;
		
/*		@GetMapping("/list")
		public String getList(Model model) {			
			log.info("컨트롤러 getList");
			
			model.addAttribute("boardList", service.getList());
			return "board/list";
		}
*/
		@GetMapping("/list")
		public String getList(PageVO pvo, Model model) {
			log.info("컨트롤러 getList");
			
			model.addAttribute("boardList", service.getList(pvo));
			return "board/list";
		}
		
		//페이지 이동
		@GetMapping("/register")
		public void goRegister() {
			
		}
		
		@PostMapping("/register")
		public String register(BoardVO bvo, RedirectAttributes ra) {
			log.info("컨트롤러 register " + bvo);
			
			service.register(bvo);
			ra.addFlashAttribute("result", bvo.getBno());
			
			return "redirect:/board/list";
		}
		
		@GetMapping({"/detail", "/edit"})
		public void goDetail(@RequestParam("bno") String bno, Model model) {
			log.info("컨트롤러 showDetail 혹은 edit" + bno);
			
			model.addAttribute("bvo", service.showDetail(bno));
		}		
	
		/*"/detail"과 합치기 
		@GetMapping("/edit")
		public void goEdit(@RequestParam("bno") String bno, Model model) {
			
			model.addAttribute("bvo", service.showDetail(bno));
		}*/
		
		@PostMapping("/edit")
		public String editBoard(BoardVO bvo, RedirectAttributes ra) {
			log.info("컨트롤러 editBoard " + bvo);
			
			if(service.editBoard(bvo)==1) {
				ra.addFlashAttribute("result", "성공");
			}
			
			return "redirect:/board/list";
		}
	
		@PostMapping("/remove")
		public String removeBoard(@RequestParam("bno") String bno, RedirectAttributes ra) {
			log.info("컨트롤러 removeBoard " + bno);
			
			if(service.removeBoard(bno)==1) {
				ra.addFlashAttribute("result", "성공");
			}
			
			return "redirect:/board/list";
		}
		

} // end of BoardController
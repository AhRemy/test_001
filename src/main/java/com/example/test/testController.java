package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	
	/**
	 * jsp 호출 테스트 
	 */
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
		
	}
	
	
	/**
	 * thymeleaf 호출 테스트
	 */
	
	@RequestMapping("thymeleaf.do")
	public String welcome(Model model) throws Exception {
		model.addAttribute("greeting", "Thymeleaf Test!");
		
		return "thymeleaf/welcome";
	}


}

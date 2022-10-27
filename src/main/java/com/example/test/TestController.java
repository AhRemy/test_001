package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class TestController {
	
	/**
	 *jsp 호출테스트
	 */
	
	@RequestMapping("/")
	public String root() {
		return "welcome";
	}
	
	/**
	 * thymeleaf 호출 test
	 */
	
	@RequestMapping("/hello")
	public String welcome(Model model) throws Exception {
		model.addAttribute("greeting", "안녕세요~??");
		
		return "thymeleaf/welcome";
		
	}

}

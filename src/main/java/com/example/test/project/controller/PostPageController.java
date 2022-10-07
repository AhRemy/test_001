package com.example.test.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/post")
@Controller
public class PostPageController {
	
	/**
	 * 게시글 리스트 페이지
	 */
    @GetMapping("/list")
    public String PostList() {
    	return "post/list";
    }
	
	/**
     * 게시글 등록 페이지
     */
    @GetMapping("/write")
    public String openPostWrite() {
        return "post/write";

    }
}

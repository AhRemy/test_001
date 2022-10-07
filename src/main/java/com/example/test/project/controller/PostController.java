package com.example.test.project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.project.dto.PostSaveDto;
import com.example.test.project.dto.PostSelectDto;
import com.example.test.project.service.PostService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/api")	
@RestController
public class PostController {
	
	private final PostService postService;
	
	@PostMapping("/post") 
	public Long save(@RequestBody final PostSaveDto params) {
		return postService.save(params);
	}
	
	@GetMapping("/post")
	public List<PostSelectDto> findAll() {
		return postService.findAll();
	}
	
	@PostMapping("/post/{id}")
	public Long save(@PathVariable final Long id, @RequestBody final PostSaveDto params) {
		return postService.update(id, params);
	}

}

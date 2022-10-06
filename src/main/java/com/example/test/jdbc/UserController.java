package com.example.test.jdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController

public class UserController {
	
	private final UserService userService;
	
	@GetMapping("/test/jdbc/user/{id}") 
		public TestUser getTestUser(@PathVariable Long id) {
		
		return userService.findById(id);
	}
	
	
	
	
}

package com.example.test.jdbc;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	public TestUser findById(Long id) {
		return userRepository.findById(id).get();
	}

}

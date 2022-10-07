package com.example.test.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.project.vo.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}

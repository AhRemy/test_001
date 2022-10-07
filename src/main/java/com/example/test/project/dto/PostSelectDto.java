package com.example.test.project.dto;

import java.time.LocalDateTime;

import com.example.test.project.vo.Post;

import lombok.Getter;

@Getter
public class PostSelectDto {
	private Long id;
	private String title;
	private String content;
	private String author;
	private int clicks;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;
	
	
	public  PostSelectDto(Post entity) {
		
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.content = entity.getContent();
		this.author = entity.getAuthor();
		this.clicks = entity.getClicks();
		this.createdDate = entity.getCreatedDate();
		this.modifiedDate = entity.getModifiedDate();
	}

}

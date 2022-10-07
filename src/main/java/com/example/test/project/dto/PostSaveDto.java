package com.example.test.project.dto;

import com.example.test.project.vo.Post;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PostSaveDto {
	private String title;
	private String content;
	private String author;
	private int clicks;
	
	@Builder
	public PostSaveDto(String title, String content, String author, int clicks) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.clicks = clicks;
	}
	
	public Post toEntity() {
		return Post.builder()
				.title(title)
				.content(content)
				.author(author)
				.clicks(clicks)
				.build();
	}
}

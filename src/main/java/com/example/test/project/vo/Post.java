package com.example.test.project.vo;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Post")
@Entity
public class Post {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(length = 500, nullable = false)
	private String title;
	
	private String content;
	
	private String author;
	
	private int clicks; // 조회수 
	
	private LocalDateTime createdDate = LocalDateTime.now(); // 생성일
	
	private LocalDateTime modifiedDate; // 수정일 
	
	
	@Builder
	public Post(String title, String content, String author, int clicks) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.clicks = clicks;
	}
	
	public void update(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.modifiedDate = LocalDateTime.now();
	}
}
	


package com.example.test.project.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.test.project.dto.PostSaveDto;
import com.example.test.project.dto.PostSelectDto;
import com.example.test.project.repository.PostRepository;
import com.example.test.project.vo.Post;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostService {
	
	private final PostRepository postRepository;
	
	/**
	 * 게시글 생성 
	 * @param saveDto
	 * @return
	 */
	@Transactional
	public Long save(PostSaveDto params) { // 성공하면 commit, 에러시 rollback
		return postRepository.save(params.toEntity()).getId();
	}
	
	/**
	 * 게시글 조회
	 * @return
	 */
	public List<PostSelectDto> findAll(){
		Sort sort = Sort.by(Direction.DESC,"id","createdDate");
		List<Post> list = postRepository.findAll(sort);
		return list.stream().map(PostSelectDto::new).collect(Collectors.toList());
		
	}
	
	/**
	 * 게시글 수정 
	 * @param id
	 * @param params
	 * @return
	 */
	
	@Transactional
	public Long update(final Long id, final PostSaveDto params) {	
		Post entity = postRepository.findById(id).orElseThrow();
		entity.update(params.getTitle(),params.getContent(),params.getAuthor());
		return id;
	}
		

}

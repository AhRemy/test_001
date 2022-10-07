package com.example.test.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.project.vo.Memo;

public interface MemoRepository extends JpaRepository<Memo,Long>{

}

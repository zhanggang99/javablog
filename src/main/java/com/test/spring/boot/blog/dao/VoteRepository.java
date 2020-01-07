package com.test.spring.boot.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.spring.boot.blog.entity.Vote;

/**
 * Vote 仓库.
 */
public interface VoteRepository extends JpaRepository<Vote, Long>{
 
}

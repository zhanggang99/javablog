package com.test.spring.boot.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.spring.boot.blog.entity.Comment;

/**
 * Comment 仓库.
 */
public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}

package com.container.blog.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.container.blog.dao.UserRegistrationDAO;
import com.container.blog.entity.User;

public interface PostService extends UserDetailsService{
	Post save(UserPostDAO userPostDAO);
	List<Post> getAllPost();
	Post getPostById(Long post_id);
	void deletePostById(Long post_id);
	
}
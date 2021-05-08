package com.container.blog.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.container.blog.dao.UserPostDAO;
import com.container.blog.entity.Post;
import com.container.blog.entity.Role;
import com.container.blog.entity.User;
import com.container.blog.repository.PostRepository;
import com.container.blog.repository.UserRepository;

@Service
public class PostServiceImpl implements PostService {

	private PostRepository postRepository;
	
	
	public PostServiceImpl(PostRepository postRepository) {
		super();
		this.postRepository = postRepository;
	}

	@Override
	public Post save(UserPostDAO userPostDAO) {
		Post post = new Post(userPostDAO.getPost_title(),
				userPostDAO.getPost_content(), 
				userPostDAO.getPost_category(), 
				userPostDAO.getPost_create_time()
				);
		return postRepository.save(post);
	}

	@Override
	public List<Post> getAllPost() {
		return postRepository.findAll();
	}

	@Override
	public Post getPostById(Long post_id) {
		Optional<Post> optional = postRepository.findById(post_id);
		Post post = null;
		if(optional.isPresent()) {
			post = optional.get();
		}
		else{
			throw new RuntimeException("Post not found for id :: " + post_id);
		}
		return post;
	}

	@Override
	public void deletePostById(Long post_id) {
		this.postRepository.deleteById(post_id);
		
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
package com.container.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.container.blog.dao.UserPostDAO;
import com.container.blog.dao.UserRegistrationDAO;
import com.container.blog.entity.Post;
import com.container.blog.entity.User;
import com.container.blog.repository.PostRepository;
import com.container.blog.service.PostService;
import com.container.blog.service.UserService;

@Controller
public class PostController {
	private PostService postService;
	
	public PostController(PostService postService) {
		super();
		this.postService = postService;
	}

	@RequestMapping(value = {"/blog"}, method = RequestMethod.GET )
	public String blog(Model model) {
		System.out.println("Blog page");
		List<Post> listPosts = postService.getAllPost();
		model.addAttribute("listPost", listPosts);
		return "blog";
	}

    @RequestMapping(value = {"/post"}, method = RequestMethod.GET )
	public String getPostForm(Model model) {
		System.out.println("Post blog page");
		model.addAttribute("post", new Post());
		return "postBlog";
	}

	@RequestMapping(value = {"/post" }, method = RequestMethod.POST )
	public String postForm(@ModelAttribute("post") UserPostDAO postDAO) {
		//save data User to database
		postService.save(postDAO);
		System.out.println("post success");
		return "redirect:/post?success";
	}

}
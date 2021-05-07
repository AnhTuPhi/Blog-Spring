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

import com.container.blog.dao.UserRegistrationDAO;
import com.container.blog.entity.User;
import com.container.blog.service.UserService;

@Controller
public class PostController {

	private UserService userService;
	
	public PostController(UserService userService) {
		super();
		this.userService = userService;
	}

	@RequestMapping(value = {"/blog"}, method = RequestMethod.GET )
	public String blog(Model model) {
		System.out.println("Blog page");
		return "blog";
	}

    @RequestMapping(value = {"/blog/post"}, method = RequestMethod.GET )
	public String getPostForm(Model model) {
		System.out.println("Blog page");
		return "blog";
	}

	@RequestMapping(value = {"/blog/post" }, method = RequestMethod.POST )
	public String postForm(@ModelAttribute("user") UserRegistrationDAO registrationDAO) {
		//save data User to database
		userService.save(registrationDAO);
		System.out.println("register success");
		return "redirect:/register?success";
	}

}
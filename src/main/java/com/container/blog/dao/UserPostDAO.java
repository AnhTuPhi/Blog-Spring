package com.container.blog.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserPostDAO {
	private String post_title;
	private String post_content;
	private String post_category;
	private Date post_create_time;
	
	public UserPostDAO(){
		
	}

	public UserPostDAO(String post_title, String post_content, String post_category, Date post_create_time) {
		super();
		this.post_title = post_title;
		this.post_content = post_content;
		this.post_category = post_category;
		this.post_create_time= post_create_time;
	}
	
	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public String getPost_content() {
		return post_content;
	}

	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}

	public String getPost_category() {
		return post_category;
	}

	public void setPost_category(String post_category) {
		this.post_category = post_category;
	}

	public Date getPost_create_time() {
		return post_create_time;
	}

	public void setPost_create_time() { 
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		this.post_category = sdf1.format(post_create_time);
	}

	
}
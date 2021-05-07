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

	
	
	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at() {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		this.email = sdf1.format(create_at);
	}
	
	
}
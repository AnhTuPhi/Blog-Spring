package com.container.blog.entity;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "posts")
public class Post {
    @Id
	@Column(name = "post_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long post_id;
	
	@Column(name = "post_title")
	private String post_title;
	
	@Column(name = "post_content")
	private String post_content;
	
	@Column(name = "post_category")
	private String post_category;
	
	@Column(name = "author_id")
	private Long author_id;
	
	@Column(name = "post_create_time")
    @CreationTimestamp
	private Date post_create_time;

	public Post() {
			
	}

	public Post(String post_title, String post_content, String post_category, Date post_create_time) {
		super();
		this.post_title = post_title;
		this.post_content = post_content;
		this.post_category = post_category;
		this.post_create_time= post_create_time;
	}

	public Long getPost_id() {
		return post_id;
	}

	public void setPost_id(Long post_id) {
		this.post_id = post_id;
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

	public String getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(Long author_id) {
		this.author_id = author_id;
	}

	public Date getPost_create_time() {
		return post_create_time;
	}

	public void setPost_create_time(Date post_create_time) {
		this.post_create_time = post_create_time;
	}

    
}

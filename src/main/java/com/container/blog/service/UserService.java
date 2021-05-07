package com.container.blog.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.container.blog.dao.UserRegistrationDAO;
import com.container.blog.entity.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDAO registrationDAO);
	List<User> getAllUsers();
	User getUserById(long id);
	void deleteUserById(Long id);
	Page<User> findPaginated(int pageNum, int pageSize, String sortField, String sortDirection);
}
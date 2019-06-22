package com.zero.service;

import java.util.List;

import com.zero.pojo.User;

public interface UserService {

	void addUser(User users);
	
	List<User> findUserAll();
	
	User findUserById(Integer id);
	
	void updateUser(User users);
	
	void deleteUserById(Integer id);

	User findUserByUsername(String username);
}

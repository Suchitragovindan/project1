package com.niit.classnote.dao;

import java.util.List;

import com.niit.classnote.model.User;

public interface UserDao {

	public boolean save(User user);

	public boolean update(User user);

	public boolean delete(User user);

	public List<User> list();
	
	public User get(String username);

	
}

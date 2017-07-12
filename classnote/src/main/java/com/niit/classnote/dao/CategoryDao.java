package com.niit.classnote.dao;

import java.util.List;

import com.niit.classnote.model.Category;

public interface CategoryDao {
	
public boolean save(Category category);
public boolean update(Category category);
public boolean delete(Category category);
public List<Category> list();
public Category get(String username);

}

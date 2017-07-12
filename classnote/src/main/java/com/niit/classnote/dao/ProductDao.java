package com.niit.classnote.dao;

import java.util.List;

import com.niit.classnote.model.Product;

public interface ProductDao {
	
public boolean save(Product product);
public boolean update(Product product);
public boolean delete(Product product);
public List <Product>list();
public Product get(String username);



}

package com.niit.classnote.dao;

import java.util.List;

import com.niit.classnote.model.Supplier;

public interface SupplierDao {
	public boolean save(Supplier supplier);
	public boolean update(Supplier supplier);
	public boolean delete(Supplier supplier);
	public List<Supplier> list();
	public Supplier get(String username);
	
	

}

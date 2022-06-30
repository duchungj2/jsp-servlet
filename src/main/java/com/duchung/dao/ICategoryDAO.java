package com.duchung.dao;

import java.util.List;

import com.duchung.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel>{
	
	List<CategoryModel> findAll();
}

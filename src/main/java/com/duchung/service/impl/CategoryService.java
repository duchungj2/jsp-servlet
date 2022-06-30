package com.duchung.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.duchung.dao.ICategoryDAO;
import com.duchung.model.CategoryModel;
import com.duchung.service.ICategoryService;

public class CategoryService implements ICategoryService{
	
	@Inject
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}

}

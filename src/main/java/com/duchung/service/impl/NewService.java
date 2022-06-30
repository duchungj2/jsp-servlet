package com.duchung.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.duchung.dao.INewDAO;
import com.duchung.model.NewModel;
import com.duchung.service.INewService;

public class NewService implements INewService{
	
	@Inject
	private INewDAO newDAO;

	@Override
	public List<NewModel> findByCategoryId(long categoryId) {
		return newDAO.findByCategoryId(categoryId);
	}
	
}

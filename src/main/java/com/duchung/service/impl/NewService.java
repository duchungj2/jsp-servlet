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

	@Override
	public NewModel save(NewModel newModel) {
		Long newId = newDAO.save(newModel);
		return null;
	}

	@Override
	public List<NewModel> findAll() {
		return newDAO.findAll();
	}

	@Override
	public int getTotalItem() {
		return newDAO.getTotalItem();
	}

	@Override
	public List<NewModel> findAll(int limit, int offset) {
		return newDAO.findAll(limit, offset);
	}
}

package com.duchung.dao;

import java.util.List;

import com.duchung.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel>{

	List<NewModel> findByCategoryId(long categoryId);
	
	Long save(NewModel newModel);
	
	List<NewModel> findAll();
	
	List<NewModel> findAll(int limit, int offset);
	
	int getTotalItem();
}

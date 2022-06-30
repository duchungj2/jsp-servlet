package com.duchung.dao;

import java.util.List;

import com.duchung.model.NewModel;

public interface INewDAO {

	List<NewModel> findByCategoryId(long categoryId);
}

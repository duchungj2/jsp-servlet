package com.duchung.service;

import java.util.List;

import com.duchung.model.NewModel;

public interface INewService {

	List<NewModel> findByCategoryId(long categoryId);
}

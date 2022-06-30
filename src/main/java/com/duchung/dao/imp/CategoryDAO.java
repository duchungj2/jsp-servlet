package com.duchung.dao.imp;

import java.util.List;

import com.duchung.dao.ICategoryDAO;
import com.duchung.mapper.CategoryMapper;
import com.duchung.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	// private static final Logger logger = LogManager.getLogger(CategoryDAO.class);

	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}
}

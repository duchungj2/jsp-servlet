package com.duchung.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.duchung.model.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel>{

	@Override
	public CategoryModel mapRow(ResultSet resultSet) {
		try {
			CategoryModel category = new CategoryModel();
			category.setCode(resultSet.getString("code"));
			category.setName(resultSet.getString("name"));
			category.setId(resultSet.getLong("id"));
			return category;
		} catch (SQLException e) {
			return null;
		}
	}

}

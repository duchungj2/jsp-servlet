package com.duchung.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.duchung.model.NewModel;

public class NewMapper implements RowMapper<NewModel>{

	@Override
	public NewModel mapRow(ResultSet resultSet) {
		try {
			NewModel newModel = new NewModel();
			newModel.setId(resultSet.getLong("id"));
			newModel.setTitle(resultSet.getString("title"));
			newModel.setContent(resultSet.getString("content"));
			newModel.setCategoryId(resultSet.getLong("category_id"));
			return newModel;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	
	
}

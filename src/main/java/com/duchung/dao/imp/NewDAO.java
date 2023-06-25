package com.duchung.dao.imp;

import java.util.List;

import com.duchung.dao.INewDAO;
import com.duchung.mapper.NewMapper;
import com.duchung.model.NewModel;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO{

	@Override
	public List<NewModel> findByCategoryId(long categoryId) {
		String sql = "SELECT * FROM news WHERE category_id = ?";
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public Long save(NewModel newModel) {
		String sql = "INSERT INTO news (title, content, category_id) VALUES (?, ?, ?)";
		return insert(sql, newModel.getTitle(), newModel.getContent(), newModel.getCategoryId());
	}

	@Override
	public List<NewModel> findAll() {
		String sql = "SELECT * FROM news";
		return query(sql, new NewMapper());
	}
	
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM news";
		return count(sql);
	}

	@Override
	public List<NewModel> findAll(int limit, int offset) {
		String sql = "SELECT * FROM news LIMIT ? OFFSET ?";
		return query(sql, new NewMapper(), limit, offset);
	}

}

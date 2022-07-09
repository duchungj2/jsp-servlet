package com.duchung.dao;

import com.duchung.mapper.RowMapper;
import java.util.List;

public interface GenericDAO<T> {

	List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	
	void update(String sql, Object...parameters);
	
	Long insert(String sql, Object...parameters);
}

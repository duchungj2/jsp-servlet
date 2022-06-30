package com.duchung.dao;

import com.duchung.mapper.RowMapper;
import java.util.List;

public interface GenericDAO<T> {

	List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
}

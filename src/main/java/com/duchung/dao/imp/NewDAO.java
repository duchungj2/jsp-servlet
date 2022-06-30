package com.duchung.dao.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.duchung.dao.INewDAO;
import com.duchung.mapper.NewMapper;
import com.duchung.model.NewModel;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO{
	
	private static final Logger logger = LogManager.getLogger(NewDAO.class);
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/servlet-jsp";
			String user = "servlet";
			String password = "duchung";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}

	@Override
	public List<NewModel> findByCategoryId(long categoryId) {
		String sql = "SELECT * FROM news WHERE category_id = ?";
		return query(sql, new NewMapper());
	}

}

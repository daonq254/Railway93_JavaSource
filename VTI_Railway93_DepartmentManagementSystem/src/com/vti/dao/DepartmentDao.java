package com.vti.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Department;
import com.vti.utils.JdbcUtils;

public class DepartmentDao {
	private JdbcUtils jdbcUtils;

	public DepartmentDao() throws FileNotFoundException, IOException {
		jdbcUtils = new JdbcUtils();
	}

	public List<Department> getListDepartment() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM Department ORDER BY DepartmentID";
		ResultSet resultSet = jdbcUtils.executeQuery(sql);
//		
		List<Department> listDep = new ArrayList<Department>();
		while (resultSet.next()) {
			Department dep = new Department(resultSet.getInt("DepartmentID"), resultSet.getString("DepartmentName"));
			listDep.add(dep);
		}
		jdbcUtils.disConnection();
		return listDep;
	}

	public Department getDepByID(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM Department WHERE DepartmentID = ?";
		PreparedStatement preStatement = jdbcUtils.createPrepareStatement(sql);
		preStatement.setInt(1, id);
		ResultSet result = preStatement.executeQuery();
		if (result.next()) {
			Department dep = new Department(result.getInt("DepartmentID"), result.getNString("DepartmentName"));
			return dep;
		} else {
			jdbcUtils.disConnection();
			return null;
		}

	}

}

package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entiy.Employee;
import com.vti.utils.JdbcUtils;

public class UserRepository implements IUserRepository {
	private JdbcUtils jdbcUtils;

	public UserRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JdbcUtils();
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) throws SQLException, ClassNotFoundException {
		List<Employee> lisEmployees = new ArrayList<>();
		String sql = "SELECT * FROM Users WHERE role = 'EMPLOYEE' AND project_id = ?";
		PreparedStatement preStatement = jdbcUtils.createPrepareStatement(sql);
		preStatement.setInt(1, projectId);
		ResultSet resultSet = preStatement.executeQuery();
		while (resultSet.next()) {
			Employee employee = new Employee(resultSet.getInt("id"), resultSet.getString("full_name"),
					resultSet.getString("email"), resultSet.getString("password"), resultSet.getInt("project_id"),
					resultSet.getString("pro_skill"));
			lisEmployees.add(employee);
		}

		return lisEmployees;

	}

}

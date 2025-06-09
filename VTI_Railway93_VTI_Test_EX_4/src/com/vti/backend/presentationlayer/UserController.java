package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entiy.Employee;

public class UserController {
	private IUserService userService;

	public UserController() {
		userService = new UserService();
	}

	public List<Employee> getEmployeesByProjectId(int projectId) throws SQLException, ClassNotFoundException {
		return userService.getEmployeesByProjectId(projectId);
	}

}

package com.vti.backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entiy.Employee;

public class UserService implements IUserService {
	private IUserRepository userRepository;

	public UserService() {
		try {
			userRepository = new UserRepository();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) throws SQLException, ClassNotFoundException {
		return userRepository.getEmployeesByProjectId(projectId);
	}

}

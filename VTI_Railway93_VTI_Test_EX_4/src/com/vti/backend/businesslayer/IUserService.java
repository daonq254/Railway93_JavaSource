package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Employee;

public interface IUserService {

	List<Employee> getEmployeesByProjectId(int projectId) throws SQLException, ClassNotFoundException;

}

package com.vti.backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.dao.DepartmentDao;
import com.vti.entity.Department;
import com.vti.utils.ScannerUtils;

public class DepartmentHandler {
	private DepartmentDao departmentDao;

	public DepartmentHandler() throws FileNotFoundException, IOException {
		departmentDao = new DepartmentDao();
	}

	// Hàm hiển thị danh sách phòng ban
	public void showAllDepartments() throws ClassNotFoundException, SQLException {
// Lấy danh sách phòng ban
		List<Department> departments = departmentDao.getListDepartment();
//	Hiển thị danh sách phòng ban
		String format = "| %-6d | %-21s |%n";
		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | Department Name       |%n");
		System.out.format("+--------+-----------------------+%n");
		for (Department d : departments) {
			System.out.format(format, d.getId(), d.getName());
		}
		System.out.format("+--------+-----------------------+%n");

	}

//	Tìm phòng ban theo ID
	public void findDepartmentById() throws ClassNotFoundException, SQLException {
		System.out.println("Please enter the ID to search:");
		int id = ScannerUtils.inputIntPositive();
		Department department = departmentDao.getDepByID(id);
		if (department != null) {
			String format = "| %-6d | %-21s |%n";
			System.out.format("+--------+-----------------------+%n");
			System.out.format("|   ID   | Department Name       |%n");
			System.out.format("+--------+-----------------------+%n");
			System.out.format(format, department.getId(), department.getName());
			System.out.format("+--------+-----------------------+%n");
		} else {
			System.out.println("This department does not exist in the system.");
		}

	}

}

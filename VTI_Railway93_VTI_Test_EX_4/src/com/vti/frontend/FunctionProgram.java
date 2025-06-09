package com.vti.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entiy.Employee;
import com.vti.utils.ScannerUtils;

public class FunctionProgram {
	private UserController userController;

	public FunctionProgram() {
		userController = new UserController();
	}

	public void getEmployeesByProjectId() throws ClassNotFoundException, SQLException {
		System.out.println("Mời bạn nhập vào ID của Project: ");
		int projectId = ScannerUtils.inputIntPositive();
		List<Employee> listeEmployees = userController.getEmployeesByProjectId(projectId);

		String leftAlignFormat = "| %-2d | %-25s | %-21s |%n";
		System.out.format("+----+---------------------------+-----------------------+%n");
		System.out.format("|ID  | Email                     |   FullName            |%n");
		System.out.format("+----+---------------------------+-----------------------+%n");

		for (Employee employee : listeEmployees) {
			System.out.format(leftAlignFormat, employee.getId(), employee.getEmail(), employee.getFullName());
		}
		System.out.format("+----+---------------------------+-----------------------+%n");

	}

}

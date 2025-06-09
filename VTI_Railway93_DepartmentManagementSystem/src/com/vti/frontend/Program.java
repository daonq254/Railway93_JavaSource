package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.DepartmentHandler;
import com.vti.utils.ScannerUtils;

public class Program {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		DepartmentHandler departmentHandler = new DepartmentHandler();

		while (true) {
			// menu
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                          DEPARTMENT MANAGEMENT SYSTEM                    |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                            Please choose an option:                      |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. View all departments");
			System.out.format(leftAlignFormat, "2. View department with ID = 5");
			System.out.format(leftAlignFormat, "3. Find department by ID");
			System.out.format(leftAlignFormat, "4. Check if department name exists");
			System.out.format(leftAlignFormat, "5. Create new department");
			System.out.format(leftAlignFormat, "6. Update existing department");
			System.out.format(leftAlignFormat, "7. Delete department by ID");
			System.out.format(leftAlignFormat, "8. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");

			System.out.print("Enter your choice (1-8): ");
			int choice = ScannerUtils.inputIntPositive(); // Nhập vào 1 số dương

			switch (choice) {
			case 1:
				System.out.println(">> Displaying all departments...");
				departmentHandler.showAllDepartments();
				break;

			case 2:
				System.out.println(">> Getting department with ID = 5...");
				break;

			case 3:
				System.out.print(">> Getting department by ID: ");
				departmentHandler.findDepartmentById();
				break;

			case 4:
				System.out.print(">> Checking department by name");
				break;

			case 5:
				System.out.println(">> Creating department");
				break;

			case 6:
				System.out.println(">> Updating department...");
				break;
			case 7:

				System.out.println(">> Deleting department By ID");
				break;
			case 8:

				System.out.println(">> Exiting program. Goodbye!");
				return; // or System.exit(0);

			default:
				System.out.println(">> Invalid choice. Please select 1–8.");
			}

			System.out.println(); // thêm dòng trắng giữa các lần lặp
			System.out.println(); // thêm dòng trắng giữa các lần lặp

		}

	}

}
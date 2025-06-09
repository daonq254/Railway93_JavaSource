package com.vti.frontend;

import java.sql.SQLException;

import com.vti.utils.ScannerUtils;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		FunctionProgram functionProgram = new FunctionProgram();
		while (true) {
			System.out.println("------MỜI BẠN CHỌN CHỨC NĂNG------");
			String leftAlignFormat = "| %-77s |%n";
			System.out.format("+-------------------------------------------------------------------------------+%n");
			System.out.format("|                             Choose please                                     |%n");
			System.out.format("+-------------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "2. Question 2. Tìm thành viên là Employee của Project theo ID");
			System.out.format(leftAlignFormat, "3. Question 3. Danh sách Manager của các project");
			System.out.format(leftAlignFormat, "4. Question 4. Login");
			System.out.format("+-------------------------------------------------------------------------------+%n");
			int choice = ScannerUtils.inputIntPositive();
			switch (choice) {
			case 1:
				break;
			case 2:
				functionProgram.getEmployeesByProjectId();
				break;
			case 3:
				break;
			case 4:
				return;
			default:
				System.out.println("Nhập lại:");
				break;

			}
		}
	}
}

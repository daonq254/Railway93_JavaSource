package com.vti.frontend;

import java.util.List;
import java.util.Scanner;

import com.vti.entity.Department;
import com.vti.repository.DepartmentRepository;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Chương trình quản lý phòng ban");
			System.out.println("1. Hiển thị danh sách phòng ban");
			System.out.println("2. Tìm phòng ban theo ID");
			System.out.println("3. Tìm phòng ban theo Name");
			System.out.println("4. Tạo mới 1 phòng");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				showDepartment();
				break;
			case 2:

				break;

			case 3:

				break;
			case 4:

				break;

			default:
				break;
			}
		}
	}

	private static void showDepartment() {
		System.out.println("Danh sách phòng ban trên hệ thống");
		DepartmentRepository departmentRepository = new DepartmentRepository();
		List<Department> listDepartment = departmentRepository.getListDepartment();
		for (Department department : listDepartment) {
			System.out.println(department.getId() + "             " + department.getName());
		}
	}
}

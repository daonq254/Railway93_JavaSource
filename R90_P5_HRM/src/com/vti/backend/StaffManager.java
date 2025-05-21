package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Engineer;
import com.vti.entity.Staff;
import com.vti.entity.Staff.Gender;
import com.vti.entity.Worker;

public class StaffManager {

	Scanner scanner = new Scanner(System.in);
	ArrayList<Staff> staffList = new ArrayList<Staff>();
//	ArrayList<Worker> workerList = new ArrayList<Worker>();

	// Phương thức thêm cán bộ
	public void addStaff() {
		while (true) {
			System.out.println("----------------------------------------------------");
			System.out.println("--------Lựa chọn chức năng bạn muốn sử dụng---------");
			System.out.println("---     1. Thêm Engineer                         ---");
			System.out.println("---     2. Thêm Worker                           ---");
			System.out.println("---     3. Thêm Employeee                        ---");
			System.out.println("---     4. Thoát                                 ---");
			System.out.println("----------------------------------------------------");

			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Thêm Engineer");
				System.out.println("Nhập vào tên Engineer: ");
				String nameEngineer = scanner.next();
				System.out.println("Nhập vào tuổi Engineer: ");
				int ageEngineer = scanner.nextInt();
//				Giới tính
				System.out.println("Nhập vào giới tính Engineer 1.Male, 2.Female, 3.Unknown: ");
				int choseGenderEngineer = scanner.nextInt();
				Gender genderName1 = null;
				switch (choseGenderEngineer) {
				case 1:
					genderName1 = Gender.MALE;
					break;
				case 2:
					genderName1 = Gender.FEMALE;
					break;
				case 3:
					genderName1 = Gender.UNKNOWN;
					break;

				}

				System.out.println("Nhập vào địa chỉ Engineer: ");
				String addEngineer = scanner.next();
				System.out.println("Nhập vào chuyên ngành Engineer: ");
				String specializedEngineer = scanner.next();

				Staff engineer = new Engineer(nameEngineer, ageEngineer, genderName1, addEngineer, specializedEngineer);

				staffList.add(engineer);

				break;
			case 2:
				System.out.println("Thêm Worker");
				System.out.println("Nhập vào tên Worker: ");
				String nameWorker = scanner.next();
				System.out.println("Nhập vào tuổi Worker: ");
				int ageWorker = scanner.nextInt();
				System.out.println("Nhập vào giới tính Worker 1.Male, 2.Female, 3.Unknown: ");
				int flagGender = scanner.nextInt();
				Gender genderName = null;
				switch (flagGender) {
				case 1:
					genderName = Gender.MALE;
					break;
				case 2:
					genderName = Gender.FEMALE;
					break;
				case 3:
					genderName = Gender.UNKNOWN;
					break;
				}
				System.out.println("Nhập vào địa chỉ Worker: ");
				String addWorker = scanner.next();
				System.out.println("Nhập vào bậc Worker: ");
				int rankWorker = scanner.nextInt();

				Staff worker = new Worker(nameWorker, ageWorker, genderName, addWorker, rankWorker);
				staffList.add(worker);
//				
				break;
			case 3:
				System.out.println("Thêm Employeee");
				break;
			case 4:
				return;

			default:
				System.out.println("Mời bạn chọn đúng chức năng");
				break;
			}
		}

	}

//	Phương thức hiển thị thông tin
	public void printListStaff() {
		for (Staff staff : staffList) {
			System.out.println(staff.toString());
		}

	}

//	Phương thức tìm kiếm
	public void findByName() {

	}

//	Phương thức xóa
	public void deleteByName() {

	}
}

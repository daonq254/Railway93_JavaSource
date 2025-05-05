package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class Demo {
	public static void main(String[] args) {
		System.out.println("CHƯƠNG TRÌNH QUẢN LÝ HỌC VIÊN VTI");
//		Tạo các phòng ban trong chương trình
		System.out.println("Tạo các phòng ban trong chương trình");
		System.out.println("Loading... Department");
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Maketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "BOD";

		System.out.println("Tạo các Vị trí trong chương trình");
		System.out.println("Loading... Position");
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.Dev;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.Test;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.Scrum_Master;

//		Nhập thông tin Account
		System.out.println("Tạo các Account trong chương trình");
		System.out.println("Loading... Account");
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "daonq1@gmail.com";
		account1.username = "daonq1";
		account1.fullname = "Nguyễn Đạo 1";
		account1.department = department2;
		account1.position = position3;
		account1.CreateDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "daonq2@gmail.com";
		account2.username = "daonq2";
		account2.fullname = "Nguyễn Đạo 2";
		account2.department = department1;
		account2.position = position2;
		account2.CreateDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "daonq3@gmail.com";
		account3.username = "daonq3";
		account3.fullname = "Nguyễn Đạo 3";
		account3.department = department3;
		account3.position = position3;
		account3.CreateDate = LocalDate.now();

//		Nhập thông tin Group
		System.out.println("Tạo các Group trong chương trình");
		System.out.println("Loading... Group");
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Music";

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "football";

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Mentor";

//		
		Group[] groupAccount1 = { group1, group2 };
		account1.group = groupAccount1;

		Group[] groupAccount2 = { group1, group2, group3 };
		account2.group = groupAccount2;

		// Hiển thị thông tin Phòng ban trên hệ thống
		System.out.println("---------------------------------------------");
		System.out.println("HIỂN THỊ THÔNG TIN ");
		System.out.println("Thông tin phòng ban");
		System.out.println("Thông tin phòng ban số 1: " + department1.toString());
		System.out.println("Thông tin phòng ban số 2: " + department2.toString());

		System.out.println("Thông tin phòng ban số 3: ");
		System.out.println("ID: " + department3.id);
		System.out.println("Name: " + department3.name);

		// Hiển thị thông tin Vị trí trên hệ thống
		System.out.println("---------------------------------------------");
		System.out.println("Thông tin Vị trí");
		System.out.println("Thông tin Position 1: " + position1.toString());
		System.out.println("Thông tin Position 2: " + position2.toString());

		// Hiển thị thông tin Account trên hệ thống
		System.out.println("---------------------------------------------");
		System.out.println("Thông tin Account 1 là: ");
		System.out.println("Id: " + account1.id);
		System.out.println("Email: " + account1.email);
		System.out.println("Fullname: " + account1.fullname);
		System.out.println("Department: " + account1.department.name);
		System.out.println("Position: " + account1.position.name);

		System.out.println("Thông tin Account 2 là: " + account2.toString());

	}
};
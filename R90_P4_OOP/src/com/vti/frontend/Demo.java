package com.vti.frontend;

import com.vti.entity.Account;
import com.vti.entity.Department;

public class Demo {
	public static void main(String[] args) {

		// Tạo ra 1 đối tượng account1
		Account account1 = new Account(1, "daonq1@vti.com", "daonq1", "Nguyễn Đạo 1");
		Account account2 = new Account(2, "daonq2@viettel.com", "daonq2", "Nguyễn Đạo 2");
		account2.id = 20;
		account2.fullname = "Nguyễn Đạo 2_ Update";

		Account account3 = new Account("daonq3@vti.com", "daonq3", "Nguyễn Đạo 3");
		account3.id = 3;

		Account account4 = new Account();
		account4.id = 4;

		System.out.println("Thông tin Account 1");
		account1.showInfo();

		System.out.println("-----------------------");
		System.out.println("Thông tin Account 2");
		account2.showInfo();

		System.out.println("-----------------------");
		System.out.println("Thông tin Account 3");
		account3.showInfo();

		System.out.println("-----------------------");
		System.out.println("Thông tin Account 43");
		account4.showInfo();

		Department department1 = new Department();
	}
}

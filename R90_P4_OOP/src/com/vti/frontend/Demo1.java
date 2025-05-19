package com.vti.frontend;

import com.vti.entity.Mentor;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Chương trình quản lý VTI");

//		Tạo mentor1
		Mentor mentor1 = new Mentor();
		mentor1.setId(1);
		mentor1.setEmail("daonq1@vti.com");
		mentor1.setUsername("daonq1");
		mentor1.setFullname("Nguyễn Đạo 1");
		mentor1.setYearOfExperience(10);

		System.out.println("Thông tin Mentor1:");
		System.out.println("ID: " + mentor1.getId());
		System.out.println("Email: " + mentor1.getEmail());
		System.out.println("Username" + mentor1.getUsername());
		System.out.println("Fullname: " + mentor1.getFullname());
		System.out.println("Experience: " + mentor1.getYearOfExperience());

//		Tạo mentor2 bằng cách sử dụng hàm tạo có đầy đủ tham số?
		Mentor mentor2 = new Mentor(2, "daonq2@gmail.com", "daonq2", "Nguyễn Đạo 2", 5);
		mentor2.showInfoMentor();

//		System.out.println("Thông tin Mentor2:");
//		System.out.println("ID: " + mentor2.getId());
//		System.out.println("Email: " + mentor2.getEmail());
//		System.out.println("Username" + mentor2.getUsername());
//		System.out.println("Fullname: " + mentor2.getFullname());
//		System.out.println("Experience: " + mentor2.getYearOfExperience());
	}
}

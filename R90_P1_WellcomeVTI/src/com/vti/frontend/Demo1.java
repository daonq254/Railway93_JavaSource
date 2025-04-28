package com.vti.frontend;

import java.time.LocalDate;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Buổi 2");
//		Khai báo 1 số nguyên
		int number1 = 1;
		byte nubmer2 = 1;
		short number3 = 10;
		long number4 = 100;

		System.out.println("number4: " + number4);

//		Khai báo số thực
		float numberf = 3.14f;
		System.out.println("nuberf: " + numberf);

//		Khai báo 1 chuỗi
		String myName = "DAONQVTI";
		System.out.println("MyName: " + myName);

//		Khai báo 1 kí tự
		char ch1 = 'D';
		System.out.println("Ký tự bạn vừa nhập là: " + ch1);

//		Khai báo kiểu boolean
		boolean status = true;
		System.out.println("Status: " + status);

//		Khai báo biến gender
		Gender gender = Gender.female;
		System.out.println("Giới tính của bạn là: " + gender);

//		Khai báo dữ liệu ngày tháng
		LocalDate day = LocalDate.of(2020, 4, 10);
		System.out.println("day: " + day);

		LocalDate today = LocalDate.now();
		System.out.println("today: " + today);

//		Danh sách học viên lớp Railway93: Sơn, Quang, Tuấn, Khuyên, Đạt
//		String student1 = "Sơn";
//		String student2 = "Quang";
//		String student3 = "Tuấn";
//		String student4 = "Khuyên";
//		String student5 = "Đạt";
//		Khai báo mảng dữ liệu
//		String[] railway93 = { "Sơn", "Quang", "Tuấn", "Khuyên", "Đạt" };
		String[] railway93 = new String[5];
		railway93[0] = "Sơn";
		railway93[1] = "Quang";
		railway93[2] = "Tuấn";
		railway93[3] = "Khuyên";
		railway93[4] = "Đạt";
		System.out.println("Phần tử số 0 của mảng là: " + railway93[0]);
		System.out.println("Phần tử số 1 của mảng là: " + railway93[1]);
//		Khai báo 1 mảng số nguyên, truy cập tới các phân tử trong mảng đó

//		Bài toán quản lý học viên tại VTI
//		Railway90:
//			student1: 
//				id: 1
//				name: Chung
//				age:  23
//			student1: 
//				id: 2
//				name: Chiến
//				age:  25

//		?? Lưu trữ danh sách các bạn học viên này
	};

}

//	Khai báo kiểu Enum cho Gender
//	public enum Gender {
//		male, female
//	}

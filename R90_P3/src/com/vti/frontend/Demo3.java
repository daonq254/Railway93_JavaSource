package com.vti.frontend;

public class Demo3 {
	public static void main(String[] args) {
// Hiển thị ra màn hình các số từ 1 đến 10
//		Số 1
//		Số 2
//		...
//		Số 10
//		System.out.println("Số 1");
//		System.out.println("Số 2");
//		System.out.println("Số 3");
//		System.out.println("Số 4");
//		System.out.println("Số 5");
//		System.out.println("Số 6");
//		System.out.println("Số 7");
//		System.out.println("Số 8");
//		System.out.println("Số 9");
//		System.out.println("Số 10");

//		for (int i = 1; i <= 10; i = i + 1) {
//			System.out.println("VTI Academy!! ");
//		}
//		

		String[] nameRailway93 = { "Quang", "Sơn", "Đạt", "Chiến", "Chánh", "Mạnh", "Dũng", "Nam", "Khoa" };
// In ra tên của tất cả các bạn học viên ở trong lớp
//		System.out.println(nameRailway93[0]);
//		System.out.println(nameRailway93[1]);
//		System.out.println(nameRailway93[2]);
//		System.out.println(nameRailway93[3]);
//		System.out.println(nameRailway93[4]);
//		System.out.println(nameRailway93[5]);
//
//		for (int i = 0; i < nameRailway93.length; i++) {
//			System.out.println(nameRailway93[i]);
//		}

		for (String name : nameRailway93) {
			System.out.println(name);
		}

	}
}

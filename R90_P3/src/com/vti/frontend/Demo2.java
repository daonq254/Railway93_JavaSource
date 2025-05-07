package com.vti.frontend;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
// Yêu cầu nhập vào 1 số từ bàn phím
//		x = 1  ==> Chủ nhật
//		x = 2  ==> Thứ 2
//		x = 3  ==> Thứ 3
//		...
//		x != khoảng giá trị bên trên ==> Giá trị không hợp lệ

		System.out.println("Mời bạn nhập vào 1 số");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		switch (day) {
		case 1:
			System.out.println("Chủ nhật");
			break;
		case 2:
			System.out.println("Thứ 2");
			break;
		case 3:
			System.out.println("Thứ ba");
			break;
		case 4:
			System.out.println("Thứ tư");
			break;
		case 5:
			System.out.println("Thứ năm");
			break;
		case 6:
			System.out.println("Thứ sáu");
			break;
		case 7:
			System.out.println("Thứ bảy");
			break;
		default:
			System.out.println("Giá trị bạn nhập vào không hợp lệ!!");
			break;
		}

//		
	}
}

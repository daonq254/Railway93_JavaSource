package com.vti.frontend;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Mời bạn nhập vào 1 số nguyên: ");
//		int number = scanner.nextInt();

//		Hãy kiểm tra xem số người dùng vừa nhập là số âm hay số dương và hiển thị kết quả ra màn hình
//		if (number >= 0) {
//			System.out.println("Số bạn vừa nhập vào là số Dương");
//		} else {
//			System.out.println("Số bạn vừa nhập vào là số Âm");
//		}

//		if (number > 0) {
//			System.out.println("Số bạn vừa nhập vào là số Dương");
//		} else if (number == 0) {
//			System.out.println("Số bạn vừa nhập vào là số 0");
//
//		} else {
//			System.out.println("Số bạn vừa nhập vào là số Âm");
//		}

//		System.out.println("Bạn vừa nhập vào số: " + number);

//		Nhập vào 2 số từ bàn phím: 
//		number1 
//		number2
//		Hiển thị ra Số lớn hơn là số nào

		System.out.println("Mời bạn nhập vào số 1:  ");
		int number1 = scanner.nextInt();

		System.out.println("Mời bạn nhập vào số 2: ");
		int number2 = scanner.nextInt();

//		if (number1 > number2) {
//			System.out.println("Số lớn nhất là: " + number1);
//		} else {
//			System.out.println("Số lớn nhất là: " + number2);
//		}
//		Viết tắt
		System.out.println("Số lớn nhất là: " + ((number1 > number2) ? number1 : number2));

	}
}

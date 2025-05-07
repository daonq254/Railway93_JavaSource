package com.vti.frontend;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		System.out.println("Project 03");
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Chương trình tính tổng 2 số:");
//		System.out.println("Mời bạn nhập vào số thứ 1:");
//
//		int number1 = scanner.nextInt();
//
//		System.out.println("Mời bạn nhập vào số thứ 2: ");
//		int number2 = scanner.nextInt();
//
//		int sum = number1 + number2;
//		System.out.println("Tổng 2 số bạn vừa nhập là: " + sum);

		System.out.println("Mời bạn nhập vào tên:");
		String myName = scanner.nextLine();

		System.out.println("Tên của bạn là: " + myName);
		scanner.close();
	}
}

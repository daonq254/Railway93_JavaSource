package com.vti.frontend;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
//		for (int i = 0; i <= 10; i++) {
//			if (i == 4) {
//				break;
//			}
//			System.out.println("Giá trị: " + i);
//		}
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Nhập lệnh: ");
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("exit")) {
				System.out.println("Thoát chương trình.");
				break;
			}
			System.out.println("Bạn đã nhập: " + input);
		}
		sc.close();

//		
	}
}

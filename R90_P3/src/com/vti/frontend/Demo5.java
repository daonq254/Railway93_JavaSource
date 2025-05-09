package com.vti.frontend;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chương trình tính toán");
		System.out.println("-------------------------");

		while (true) {
			System.out.println("MENU: Mời bạn chọn chức năng");
			System.out.println("1. Tính tổng 2 số");
			System.out.println("2. Tính hiệu 2 số");
			System.out.println("3. Tính phép nhân 2 số");
			System.out.println("4. Thoát chương trình");

			System.out.println("-------------------------");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Tính tổng 2 số");
				System.out.println("Mời bạn nhập số thứ 1");
				int number1 = scanner.nextInt();
				System.out.println("Mời bạn nhập số thứ 2");
				int number2 = scanner.nextInt();

				System.out.println("Tổng 2 số bạn vừa nhập là: " + number1 + number2);
				break;

			case 2:
				System.out.println("Tính hiệu 2 số");
				break;

			case 3:
				System.out.println("Tính phép nhân 2 số");
				break;

			case 4:
				System.out.println("Thoát chương trình");
				return;

			default:
				break;
			}
		}

	}
}

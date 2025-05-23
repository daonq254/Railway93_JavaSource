package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.MathBackend;

public class Demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MathBackend mathBackend = new MathBackend();

		while (true) {
			System.out.println("Nhập số thứ nhất: ");
			int a = scanner.nextInt();

			System.out.println("Nhập số thứ hai: ");
			int b = scanner.nextInt();

			System.out.println("Chọn phép toán (+, -, *, /): ");
			String operation = scanner.next();

			int result = 0;

			switch (operation) {
			case "+":
				result = mathBackend.add(a, b);
				System.out.println("Kết quả: " + result);
				break;

			case "-":
				result = mathBackend.subtract(a, b);
				System.out.println("Kết quả: " + result);
				break;

			case "*":
				result = mathBackend.multiply(a, b);
				System.out.println("Kết quả: " + result);
				break;
			case "/":
//				if (b == 0) {
//					System.out.println("Lỗi: Không thể chia cho 0");
//				} else {
				result = mathBackend.divide(a, b);
				System.out.println("Kết quả: " + result);

//				}
				break;

			default:
				System.out.println("Phép toán không hợp lệ");

			}

		}

	}
}

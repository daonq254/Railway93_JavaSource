package com.vti.frontend;

public class Demo7 {
	public static void main(String[] args) {
//		for (int i = 0; i <= 10; i = i + 1) {
//
//			if (i == 5) {
//				continue;
//			}
//			System.out.println("Giá trị: " + i);
//
//		}
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue; // Bỏ qua số chẵn
			}
			System.out.println(i); // In ra chỉ số lẻ
		}

	}
}

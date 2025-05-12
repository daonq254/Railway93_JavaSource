package com.vti.frontend;

import java.util.Random;

public class Demo11 {
	public static void main(String[] args) {
// Random
		Random random = new Random();
		int randomNumber = random.nextInt(100); // 0 -- 100

		System.out.println("Số ngẫu nhiên được tạo là: " + randomNumber);

//		Tạo ra 1 mật khẩu ngẫu nhiên gồm 6 kí tự
		System.out.println("---------------------------------------------------");
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789()!@#$%^&**";
		String password = "";
		for (int i = 0; i < 6; i++) {
			int index = random.nextInt(chars.length());
			password += chars.charAt(index);
		}
		System.out.println("Mật khẩu của bạn là: " + password);
	}
}

package com.vti.frontend;

import com.vti.backend.MathBackend;

public class Demo1 {
	public static void main(String[] args) {
		int a = 1;
		int b = 5;

		MathBackend mathBackend = new MathBackend();

		int resutl = MathBackend.add(a, b);

		System.out.println("Kết quả phép cộng 2 số: " + resutl);

		tinhtong(a, b);

	}

	private static void tinhtong(int a, int b) {

	}
}

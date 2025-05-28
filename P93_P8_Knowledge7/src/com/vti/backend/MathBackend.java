package com.vti.backend;

public class MathBackend {

	static int z = 10;

	public static int add(int x, int y) {
		int resutl = x + y + z;
		return resutl;
	}

	public static int subtract(int x, int y) {
		return x - y;
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static int divide(int x, int y) {
		return x / y;
	}

}

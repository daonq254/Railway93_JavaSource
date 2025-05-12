package com.vti.frontend;

public class Demo12 {
	public static void main(String[] args) {
		int number1 = 10;
		Integer number2 = 20;

		System.out.println("Số nguyên number1: " + number1);
		System.out.println("Số nguyên number2: " + number2);

		boolean status1 = true;
		Boolean status2 = true;

		System.out.println("status1: " + status1);
		System.out.println("status2: " + status2);

//		Chuyển đổi từ kiểu Primitive ==> Wrapper Class
		Integer number1Integer;
//		number1Integer = Integer.valueOf(number1);
		number1Integer = number1;

//		Chuyển đổi từ kiểu Wrapper Class  ==> Primitive
		int number2int;
		number2int = number2.intValue(); // 20

	}
}

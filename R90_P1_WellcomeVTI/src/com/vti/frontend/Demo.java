package com.vti.frontend;

public class Demo {
//	Hàm Main()
	public static void main(String[] args) {
// 		Hiển thị ra đoạn text Wellcome to VTI!!
		System.out.println("Wellcome to VTI!!");

//		Chương trình tính tổng 2 số nguyên
		sum();

//		Chương trình tính hiệu của 2 số
		System.out.println("Mời bạn nhập vào số thứ ba!!"); // 20
		int num3 = 20;

		System.out.println("Mời bạn nhập vào số thứ bốn!!"); // 10
		int num4 = 10;

		int resutl_minus = minus(num3, num4); // 10
		System.out.println("Kết quả phép trừ của 2 số bên trên là: " + resutl_minus);
	}

//	Kết thúc hàm Main()
//  Khai báo hàm tính tổng 2 số
	private static void sum() {
//		Bước 1: Báo người dùng nhập vào 1 số
		System.out.println("Mời bạn nhập vào số thứ nhất!!"); // 10
		int num1 = 10;

		System.out.println("Mời bạn nhập vào số thứ hai!!"); // 5
		int num2 = 5;
//		Bước 2: Xử lý dữ liệu, tính tổng 2 số
		int sum = num1 + num2;
//		Bước 3: In ra kết quả
		System.out.println("Tổng của 2 số là: " + sum);
	}

//	Khai báo hàm tính hiệu 2 số
	private static int minus(int number3_param, int number4_param) {
		int minus = number3_param - number4_param;

		return minus;
	}
//	
}

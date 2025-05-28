package com.vti.frontend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Code 1");
		System.out.println("Code 2");
		System.out.println("Code 3");
		System.out.println("Code 4");
//		System.out.println("Code 5");

		try {
			System.out.println("Mời bạn nhập vào số a");
			int a = scanner.nextInt();
//			
			int result = 100 / a;
			System.out.println("Result: " + result);

//			
//			int[] numberArray = new int[3];
//			numberArray[4] = 1;

		} catch (InputMismatchException e) {
//			e.printStackTrace();
			System.err.println("Mời bạn kiểm tra lại định dạng dữ liệu");
		} catch (ArithmeticException e) {
			System.err.println("Không thể thực hiện phép chia cho số 0");
		} catch (Exception e) {
			System.err.println("Đã có lỗi xảy ra, hãy kiểm tra lại");
		} finally {
			System.out.println("Đã thực hiện xong đoạn code 5!!");
		}

		System.out.println("Code 6");
		System.out.println("Code 7");
		System.out.println("Code 8");
		System.out.println("Code 9");
		System.out.println("Code 10");

	}
}

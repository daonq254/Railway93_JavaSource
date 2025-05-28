package com.vti.frontend;

import com.vti.backend.Math;

public class Demo3 {
	public static void main(String[] args) {
		Math math = new Math();

		int x = 10;
		int y = 0;
//		try {
//			float resutlDevice = math.device(x, y);
//			System.out.println("Result: " + resutlDevice);
//		} catch (Exception e) {
//			System.out.println("Không thể thực hiện phép chia cho 0");
//		}

		try {
			float resutlDevice = math.device(x, y);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Không thể thực hiện phép chia cho 0");
		}

	}
}

package com.vti.frontend;

import com.vti.entity.Math;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("Chương trình tính tổng 2 số");
		int a = 10;
		int b = 20;
		Math math = new Math();
		int resutl1 = math.sum(a, b);
		System.out.println("Tổng của 2 số nguyên bên trên là: " + resutl1);

//		math.sum_int(10.2f, 20.3f);

		float resutl2 = math.sum(10.2f, 20.3f);
		System.out.println("Tổng của 2 số thực bên trên là: " + resutl2);

//		
		int resutl3 = math.sum(10, 15, 16);
		System.out.println("Tổng của 3 số nguyên bên trên là: " + resutl3);

	}
}

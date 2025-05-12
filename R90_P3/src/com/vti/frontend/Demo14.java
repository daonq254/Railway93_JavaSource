package com.vti.frontend;

public class Demo14 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "HElLo";
//		Nối chuỗi

//		String s3 = s1 + " " + s2;
		String s3 = s1.concat(" ").concat(s2);
		System.out.println(s3);
//		So sánh chuỗi
//		boolean result = s1.equals(s2);
		boolean result = s1.equalsIgnoreCase(s2);
		if (result == true) {
			System.out.println("Hai chuỗi này giống nhau");
		} else {
			System.out.println("Hai chuỗi này khác nhau");
		}

	}
}

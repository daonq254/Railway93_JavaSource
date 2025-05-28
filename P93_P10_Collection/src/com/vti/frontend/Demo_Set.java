package com.vti.frontend;

import java.util.Set;
import java.util.TreeSet;

public class Demo_Set {
	public static void main(String[] args) {
		Set<String> students = new TreeSet<>();

		// Thêm học viên
		students.add("K");
		students.add("A");
		students.add("X");
		students.add("A");
		students.add("C");
		students.add("B");
		students.add("Y");
		students.add("Z");
		// Trùng => không thêm
//		Nguyễn Văn A  Trần Thị B Lê Văn C

		System.out.println("Danh sách học viên ban đầu:");
		System.out.println(students);

	}
}

package com.vti.frontend;

import com.vti.entity.Student;

public class Demo {
	public static void main(String[] args) {

		Student.className = "Railway_93";

		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Student1");
//		student1.setClassName("Railway_93");
//		student1.count = ++student1.count;

		Student student2 = new Student();
		student2.setId(1);
		student2.setName("Student2");
//		student2.setClassName("Railway_93");

//		student2.count = ++Student.count;

		Student student3 = new Student();
		student3.setId(1);
		student3.setName("Student3");
//		student3.setClassName("Railway_93");
//		student3.count = ++Student.count;

		student1.className = "Railway_94";
		student2.className = "Railway_95";

		Student.fund = 300000; // Đóng

		student1.fund = 300000 - 50000; // 250000

		student2.fund = 250000 - 100000; // 150 000

		Student.fund = 150000 + 300000;

		System.out.println(student1.toString()); // Railway_95
		System.out.println(student2.toString()); // Railway_95
		System.out.println(student3.toString()); // Railway_95

		System.out.println("Tiền quỹ lớp còn lại: " + Student.fund); // 450000

		System.out.println("Số lượng Student được sinh ra là: " + Student.count);
//		==> Các bạn chuyển qua làm dự tập trận  ==> MOCK2501(Railway_93)
//		System.out.println("Chuyển sang lớp MOCK");
//		Student.className = "MOCK2501";
//		System.out.println(student1.toString());
//		System.out.println(student2.toString());
//		System.out.println(student3.toString());
//		student1.setClassName("MOCK2501");
//		student2.setClassName("MOCK2501");
//		student3.setClassName("MOCK2501");

	}
}

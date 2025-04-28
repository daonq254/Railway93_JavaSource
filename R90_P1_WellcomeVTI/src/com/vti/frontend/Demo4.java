package com.vti.frontend;

import com.vti.entity.Student;

public class Demo4 {
	public static void main(String[] args) {
		System.out.println("Chương trình quản lý học viên tại VTI");
		System.out.println("Mời bạn nhập vào thông tin các học viên");
		System.out.println("..............................");

		Student student1 = new Student();
		student1.id = 1;
		student1.name = "Sơn";
		student1.age = 20;

		Student student2 = new Student();
		student2.id = 2;
		student2.name = "Hùng";
		student2.age = 20;

		Student student3 = new Student();
		student3.id = 3;
		student3.name = "Thắng";
		student3.age = 25;

//		
		System.out.println("Thông tin các bạn học viên vừa nhập vào:");
		System.out.println("Thông tin bạn học viên số 1, ID: " + student1.id + " ,Name: " + student1.name + " ,Age: "
				+ student1.age);

		System.out.println("Thông tin bạn học viên số 2, ID: " + student2.id + " ,Name: " + student2.name + " ,Age: "
				+ student2.age);
		System.out.println("Thông tin bạn học viên số 3, ID: " + student3.id + " ,Name: " + student3.name + " ,Age: "
				+ student3.age);
	}
}

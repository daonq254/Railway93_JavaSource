package com.vti.frontend;

import com.vti.entity.Student;

public class Demo {
	public static void main(String[] args) {

//		student1(1,"Sơn")
		Student<Integer> student1 = new Student<>();
		student1.setId(1);
		student1.setName("Sơn");

//		student1("VTI_VN_001","Lan")
		Student<String> student2 = new Student<>();
		student2.setId("VTI_VN_001");
		student2.setName("Lan");

//		student1(0.01f,"Lan")
		Student<Float> student3 = new Student<>();
		student3.setId(0.01f);
		student3.setName("Lan");

//		System.out.println("Học viên 1:" + student1.toString());
//		System.out.println("Học viên 2:" + student2.toString());
//		System.out.println("Học viên 3:" + student3.toString());
		printStudent(student1);
	}

	private static <T> void printStudent(Student<T> student) {
		System.out.println("Thông tin bạn học viên");
		System.out.println("ID: " + student.getId());
		System.out.println("Name: " + student.getName());
	}
}

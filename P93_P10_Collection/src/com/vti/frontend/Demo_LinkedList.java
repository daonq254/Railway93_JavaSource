package com.vti.frontend;

import java.util.Iterator;
import java.util.LinkedList;

import com.vti.entity.Student;

public class Demo_LinkedList {
	public static void main(String[] args) {
		LinkedList<Student> students = new LinkedList<>();

		Student student1 = new Student("VTI001", "Student 1");
		Student student2 = new Student("VTI002", "Student 2");
		Student student3 = new Student("VTI003", "Student 3");
		Student student4 = new Student("VTI004", "Student 4");

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		Iterator<Student> iterator = students.iterator();

		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.toString());
		}

	}
}

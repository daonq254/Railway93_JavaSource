package com.vti.entity;

public class Student {
	private int id;
	private String name;
	public static String className;
	public static int fund;
	public static int count = 0;

	public Student() {
		++count;
	}

	public Student(int id, String name, String className) {
		this.id = id;
		this.name = name;
		this.className = className;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", className=" + className + "]";
	}

}

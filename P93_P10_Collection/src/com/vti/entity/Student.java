package com.vti.entity;

public class Student {
	private String id;
	private String fullName;

	public Student(String id, String fullName) {
		this.id = id;
		this.fullName = fullName;
	}

	public String getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Full Name: " + fullName;
	}

}

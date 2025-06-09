package com.vti.entity;

public class Department {
	private int id;
	private String name;

	public Department() {
	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Department(String name) {
		this.name = name;
	}

	// Getters & Setters
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

	@Override
	public String toString() {
		return "Department{" + "ID=" + id + ", Name='" + name + '\'' + '}';
	}

}

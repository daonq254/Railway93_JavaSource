package com.vti.entiy;

public class Project {
	private int id;
	private String name;

	public Project() {
	}

	public Project(int id, String name) {
		this.id = id;
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

	// toString
	@Override
	public String toString() {
		return "Project{id=" + id + ", name='" + name + "'}";
	}
}

package com.vti.entiy;

public class Employee extends User {
	private String proSkill;

	public Employee(int id, String fullName, String email, String password, int projectId, String proSkill) {
		super(id, fullName, email, password, projectId, Role.EMPLOYEE);
		this.proSkill = proSkill;
	}

	public String getProSkill() {
		return proSkill;
	}

	@Override
	public void displayInfo() {
		System.out.printf("Employee [ID=%d, Name=%s, Email=%s, ProSkill=%s, ProjectID=%d]%n", id, fullName, email,
				proSkill, projectId);
	}
}

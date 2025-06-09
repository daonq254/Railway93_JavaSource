package com.vti.entiy;

public class Manager extends User {
	private int expInYear;

	public Manager(int id, String fullName, String email, String password, int projectId, int expInYear) {
		super(id, fullName, email, password, projectId, Role.MANAGER);
		this.expInYear = expInYear;
	}

	public int getExpInYear() {
		return expInYear;
	}

	@Override
	public void displayInfo() {
		System.out.printf("Manager [ID=%d, Name=%s, Email=%s, ExpInYear=%d, ProjectID=%d]%n", id, fullName, email,
				expInYear, projectId);
	}
}

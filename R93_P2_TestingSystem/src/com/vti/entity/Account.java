package com.vti.entity;

import java.time.LocalDate;

public class Account {
	public int id;
	public String email;
	public String username;
	public String fullname;
	public Department department;
	public Position position;
	public LocalDate CreateDate;
	public Group[] group;

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullname=" + fullname
				+ ", department=" + department.name + ", position=" + position.name + ", CreateDate=" + CreateDate
				+ "]";
	}

}

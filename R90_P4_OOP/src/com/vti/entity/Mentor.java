package com.vti.entity;

public class Mentor extends Account {
//	private int id;
//	private String email;
//	private String username;
//	private String fullname;
	private int yearOfExperience;

	public Mentor() {

	}

	public Mentor(int id, String email, String username, String fullname, int yearOfExperience) {
		// super(id, email, username, fullname); //Account(id, email, username,
		// fullname);
		super.setId(id);
		super.setEmail(email);
		super.setUsername(username);
		super.setFullname(fullname);
		this.yearOfExperience = yearOfExperience;

	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

//	Viết phương thức showInfoMentor
	public void showInfoMentor() {
//		System.out.println("ID: " + super.getId());
//		System.out.println("Email: " + super.getEmail());
//		System.out.println("UserName: " + super.getUsername());
//		System.out.println("Fullname: " + super.getFullname());
		super.showInfo();
		System.out.println("Experience: " + this.yearOfExperience);

	}

}

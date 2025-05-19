package com.vti.entity;

public class Account {
//	Thuộc tính
	private int id;
	private String email;
	private String username;
	private String fullname;

//	Hàm contructor
	public Account() {

	}

	public Account(int id, String email, String username, String fullname) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = fullname;
	}

//
//	public Account(String email, String username, String fullname) {
//		this.email = email;
//		this.username = username;
//		this.fullname = fullname;
//	}

	//
//	public Account(String username, String fullname) {
//		this.username = username;
//		this.fullname = fullname;
//	}

	//

//	Phương thức
	public void showInfo() {
		System.out.println("ID: " + this.id);
		System.out.println("email: " + this.email);
		System.out.println("username: " + this.username);
		System.out.println("fullname: " + this.fullname);
	}

// Hàm Setter, Getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

}

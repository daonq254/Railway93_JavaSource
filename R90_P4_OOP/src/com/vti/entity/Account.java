package com.vti.entity;

public class Account {
//	Thuộc tính
	public int id;
	public String email;
	public String username;
	public String fullname;

//	Hàm contructor
	public Account(int id, String email, String username, String fullname) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = fullname;
	}

//
	public Account(String email, String username, String fullname) {
		this.email = email;
		this.username = username;
		this.fullname = fullname;
	}

	//
	public Account(String username, String fullname) {
		this.username = username;
		this.fullname = fullname;
	}

	//
	public Account() {

	}

//	Phương thức
	public void showInfo() {
		System.out.println("ID: " + this.id);
		System.out.println("email: " + this.email);
		System.out.println("username: " + this.username);
		System.out.println("fullname: " + this.fullname);
	}

}

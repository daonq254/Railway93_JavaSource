package com.vti.frontend;

public class Frog {
	static int count = 0;

	public Frog() {
		count++;
		}

	public static void main(String[] args) {
		new Frog();
		new Frog();
		new Frog();
		System.out.println("count=" + count);
	}
}

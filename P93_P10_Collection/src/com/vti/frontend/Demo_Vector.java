package com.vti.frontend;

import java.util.Vector;

public class Demo_Vector {
	public static void main(String[] args) {
		Vector<String> cities = new Vector<>();
		cities.add("Hanoi");
		cities.add("Da Nang");
		cities.add("Ho Chi Minh City");
		cities.add(1, "Hue");

		System.out.println("Cities list:");
		for (String city : cities) {
			System.out.println(city);
		}
		System.out.println("First city: " + cities.firstElement());
		System.out.println("City at index 2: " + cities.get(2));
		System.out.println("Last city: " + cities.lastElement());
	}
}

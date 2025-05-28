package com.vti.frontend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo_ArrayList {
	public static void main(String[] args) {
		List<String> languages = new ArrayList<>();

		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		languages.add("Java");
		System.out.println("Phần tử thứ 2: " + languages.get(1)); // Python

		for (String lang : languages) {
			System.out.println(lang);
		}

		Iterator<String> iterator = languages.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

	}

}

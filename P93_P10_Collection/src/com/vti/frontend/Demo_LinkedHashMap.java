package com.vti.frontend;

import java.util.Map;
import java.util.TreeMap;

public class Demo_LinkedHashMap {
	public static void main(String[] args) {
//		Map<Integer, String> books = new TreeMap<>();
//
//		books.put(101, "Java Core");
//		books.put(105, "Microservices");
//		books.put(103, "Microservices");
//		books.put(102, "Spring Boot");
//		books.put(104, "ReactJS");
//
//		System.out.println("Danh sách sách (theo thứ tự chèn):");
//		for (Map.Entry<Integer, String> entry : books.entrySet()) {
//			System.out.println(entry.getKey() + " - " + entry.getValue());
//		}
		Map<String, Integer> scores = new TreeMap<>();

		scores.put("Minh", 85);
		scores.put("An", 90);
		scores.put("Linh", 78);
		scores.put("Bình", 92);

		System.out.println("Danh sách điểm theo tên (key):");
		for (Map.Entry<String, Integer> entry : scores.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}
}

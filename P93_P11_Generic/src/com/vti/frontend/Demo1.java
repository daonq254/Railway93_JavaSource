package com.vti.frontend;

public class Demo1 {
	public static void main(String[] args) {
		Integer[] intArray = { 1, 5, 2, 7, 8 };
		Float[] floatArray = { 1.2f, 5.3f, 2f, 7.8f, 8.2f };
		Double[] doubleArray = { 1.2, 5.3, 2.2, 7.8, 8.2 };
		String[] stringArray = { "Java", "Python", "C++", "Go" };

		printArray(intArray);
		printArray(floatArray);
	}

	private static <E> void printArray(E[] array) {
		System.out.println("Phần tử trong mảng là: ");
		for (E e : array) {
			System.out.print(e + " ");
		}
	}
}

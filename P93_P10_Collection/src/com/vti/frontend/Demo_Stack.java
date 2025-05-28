package com.vti.frontend;

import java.util.Stack;

public class Demo_Stack {
	public static void main(String[] args) {
		Stack<String> studentStack = new Stack<>();

		studentStack.push("Nguyễn Văn A");
		studentStack.push("Trần Thị B");
		studentStack.push("Lê Văn C");
		studentStack.push("Phạm Thị D");

		for (String name : studentStack) {
			System.out.println(name);
		}
		System.out.println("------");
		studentStack.pop();
		studentStack.pop();
		for (String name : studentStack) {
			System.out.println(name);
		}
		System.out.println("------");
		studentStack.pop();
		for (String name : studentStack) {
			System.out.println(name);
		}

		System.out.println("---Peek---");
		studentStack.peek();
		for (String name : studentStack) {
			System.out.println(name);
		}
	}
}

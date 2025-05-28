package com.vti.frontend;

import java.util.LinkedList;
import java.util.Queue;

public class Demo_Queue {
	public static void main(String[] args) {
		Queue<String> tasks = new LinkedList<>();

		tasks.offer("In tài liệu");
		tasks.offer("Gửi email");
		tasks.offer("Nộp báo cáo");

		for (String task : tasks) {
			System.out.println(task);
		}
		System.out.println("-----------poll------------");
		tasks.poll();
		tasks.poll();
		for (String task : tasks) {
			System.out.println(task);
		}

		System.out.println("Peek: " + tasks.peek());

		for (String task : tasks) {
			System.out.println(task);
		}

	}
}

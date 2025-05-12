package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Exercise1;

public class Demo15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("+--------------------------------------------------------------------------+");
			System.out.printf("|%-74s|%n", "                       Mời bạn chọn bài tập muốn xem");
			System.out.println("+--------------------------------------------------------------------------+");
			System.out.printf("|%-74s|%n", "1.  Exercise 1");
			System.out.printf("|%-74s|%n", "2.  Exercise 2");
			System.out.printf("|%-74s|%n", "3.  Exercise 3");
			System.out.printf("|%-74s|%n", "10. Exit");
			System.out.println("+--------------------------------------------------------------------------+");

			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				showMenuExercise1();
				break;

			case 2:

				break;
			case 3:

				break;

			case 10:

				return;
			default:
				break;
			}
		}

	}

//	
	public static void showMenuExercise1() {
		Scanner scanner = new Scanner(System.in);
		Exercise1 exercise1 = new Exercise1();

		while (true) {
			System.out.println("+--------------------------------------------------------------------------+");
			System.out.printf("|%-74s|%n", "                       Mời bạn chọn Question muốn xem");
			System.out.println("+--------------------------------------------------------------------------+");
			System.out.printf("|%-74s|%n", "1.  Question 1");
			System.out.printf("|%-74s|%n", "2.  Question 2");
			System.out.printf("|%-74s|%n", "3.  Question 3");
			System.out.printf("|%-74s|%n", "10.  Exit");
			System.out.println("+--------------------------------------------------------------------------+");

			int choose = scanner.nextInt();

			switch (choose) {
			case 1:
				exercise1.question1();
				break;
			case 2:

				exercise1.question2();
				break;

			case 3:
				exercise1.question3();
				break;

			case 10:
				return;
			default:
				break;
			}
		}

	}
//	

}

package com.vti.frontend;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
	public static void main(String[] args) {
// Lưu 1 danh sách tên các bạn học viên ở trong lớp
//		Mạnh, Quang, Tuấn, Lộc, Quân.
//		String[] namRailway93 = new String[6];

//		namRailway93={"Mạnh","Quang","Tuấn","Lộc","Quân"};
//		namRailway93[0] = "Mạnh";
//		namRailway93[1] = "Quang";
//		namRailway93[2] = "Tuấn";
//		namRailway93[3] = "Lộc";
//		namRailway93[4] = "Quân";
//		namRailway93[5] = "Đáp";

//		System.out.println("Danh sách lớp Railway93");
//		for (String name : namRailway93) {
//			System.out.println(name);
//		}

//		Sử dụng ArrayList để khai báo mảng động
		ArrayList<String> nameRailway93 = new ArrayList<>();
//		Thêm 5 bạn học viên
		nameRailway93.add("Mạnh");
		nameRailway93.add("Quang");
		nameRailway93.add("Tuấn");
		nameRailway93.add("Lộc");
		nameRailway93.add("Quân");

//		In danh sách các bạn học viên
		for (String name : nameRailway93) {
			System.out.println(name);
		}
//		Thêm bạn Đáp
		nameRailway93.add("Đáp");

		System.out.println("Sau khi thêm bạn Đáp");
		for (String name : nameRailway93) {
			System.out.println(name);
		}

//		
		nameRailway93.add(1, "DaoNQ");
		System.out.println("Sau khi thêm bạn DaoNQ");
		for (String name : nameRailway93) {
			System.out.println(name);
		}

//		Duyệt mảng sử dụng Iterator
//		Khai báo
		Iterator<String> iterator = nameRailway93.iterator();
//		Duyệt mảng
		System.out.println("Sử dụng Iterator để duyệt mảng");
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
	}
}

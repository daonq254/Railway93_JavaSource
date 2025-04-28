package com.vti.frontend;

import com.vti.entity.ConNguoi;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("Demo Class- Object");
//		Khai báo ra các đối tượng trong chương trình
//		Lưu trữ thông tin các đối tượng
		ConNguoi hocvien1 = new ConNguoi();
		hocvien1.ten = "Chien";
		hocvien1.tuoi = 18;
		hocvien1.dia_chi = "HN";
		hocvien1.mau_toc = "vang";
		hocvien1.mau_da = "trang";

		ConNguoi hocvien2 = new ConNguoi();
		hocvien2.ten = "Quang";
		hocvien2.tuoi = 20;
		hocvien2.dia_chi = "BN";
		hocvien2.mau_toc = "Den";
		hocvien2.mau_da = "Den";

//		In thông tin các bạn học viên
		System.out.println("Thông tin bạn học viên số 1:");
		System.out.println("Tên: " + hocvien1.ten);
		System.out.println("tuoi: " + hocvien1.tuoi);
		System.out.println("dia_chi: " + hocvien1.dia_chi);
		System.out.println("mau_toc: " + hocvien1.mau_toc);
		System.out.println("mau_da: " + hocvien1.mau_da);
	}
}

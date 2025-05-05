package com.vti.entity;

public class ConNguoi {
//	Thuộc tính
	public String ten;
	public int tuoi;
	public String dia_chi;
	public String mau_toc;
	public String mau_da;

//...
//	Phương thức
//	Các đối tượng sau này được tạo ra từ lớp Con người này đều có hành động ăn
	public void an() {
		System.out.println("Tôi có thể Ăn!!");
	}

//	
	public void choi() {
		System.out.println("Tôi có thể chơi!!");
	}

//	Viết phương thức tự giới thiệu thông tin bản thân của 1 người
	public void gioi_thieu() {
		System.out.println("Tôi xin giới thiệu về bản thân");
		System.out.println("Tên tôi là: " + this.ten);
		System.out.println("Tuổi tôi là: " + this.tuoi);
		System.out.println("Địa chỉ là: " + this.dia_chi);
		System.out.println("Màu tóc là: " + this.mau_toc);
		System.out.println("Màu da là: " + this.mau_da);
	}

	@Override
	public String toString() {
//		String result = "Ten=" + ten + ", tuoi=" + tuoi + ", dia_chi=" + dia_chi + ", mau_toc=" + mau_toc + ", mau_da="
//				+ mau_da;
//		return result;

		return "Ten=" + ten + ", tuoi=" + tuoi + ", dia_chi=" + dia_chi + ", mau_toc=" + mau_toc + ", mau_da=" + mau_da;
	}

//
//	@Override
//	public String toString() {
//		return "Tên: " + this.ten + ",tuổi: " + this.tuoi + " ,địa chỉ: " + this.dia_chi;
//	}

}

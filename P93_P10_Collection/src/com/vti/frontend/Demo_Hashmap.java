package com.vti.frontend;

import java.util.HashMap;
import java.util.Map;

public class Demo_Hashmap {
	public static void main(String[] args) {
// Thực hiện lưu các bạn học viên tại lớp Railway90, có mã học viên, tên học viên
		Map<String, String> students = new HashMap<>();
//		Key String
//		Value String
		students.put("VTI001", "Nguyễn Hồng Quang"); // entry
		students.put("VTI002", "Bùi Quang Chung");
		students.put("VTI003", "Phạm Tiến Mạnh");
		students.put("VTI004", "Trần Đăng Tuấn");
		students.put("VTI005", "Lại Khánh Nam");
		students.put("VTI006", "Nguyễn Tăng Mạnh");
		students.put("VTI006", "Nguyễn Tăng Mạnh"); // bỏ
		students.put("VTI006", "Nguyễn Duy Tân"); // bỏ
		students.put("VTI007", "Nguyễn Duy Tân"); // có
		students.put("VTI008", "Nguyễn Duy Tân"); // có
//		Hiển thị dữ liệu
		System.out.println("Danh sách học viên");

		for (Map.Entry<String, String> entry : students.entrySet()) {
			System.out.println(entry.getKey() + "     " + entry.getValue());
		}

		System.out.println("Phần tử có key VTI002 là:" + students.get("VTI002"));

	}
}

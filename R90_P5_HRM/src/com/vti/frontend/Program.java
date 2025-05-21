package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.StaffManager;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StaffManager staffManager = new StaffManager();

		while (true) {
			System.out.println("======================================================================");
			System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");
			System.out.println("===              1. Thêm mới cán bộ.                               ===");
			System.out.println("===              2. Tìm kiếm theo họ tên.                          ===");
			System.out.println("===              3. Hiện thị thông tin về danh sách các cán bộ.    ===");
			System.out.println("===              4. Nhập vào tên của cán bộ và delete cán bộ đó    ===");
			System.out.println("===              5. Thoát khỏi chương trình.                       ===");
			System.out.println("======================================================================");
			int menuChoose = scanner.nextInt();
			switch (menuChoose) {
			case 1:
				staffManager.addStaff();
				break;
			case 2:
				staffManager.findByName();
				break;

			case 3:
				staffManager.printListStaff();
				break;

			case 4:
				staffManager.deleteByName();
				break;

			case 5:
				return;

			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
			}
		}

	}
}

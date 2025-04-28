package com.vti.frontend;

import com.vti.backend.Account_Backend;
import com.vti.dao.AccDAO_JPA;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Chương trình tạo mới Account!!");
		Account_Backend account_Backend = new Account_Backend(new AccDAO_JPA());
		if (account_Backend.createAccount()) {
			System.out.println("Tạo Account thành công!");
		} else {
			System.out.println("Tạo Account không thành công, hãy kiểm tra lại!");
		}

	}
}

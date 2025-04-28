package com.vti.backend;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Account;

public class AccountBackend {
//	Hàm lấy danh sách Account trong DB
	public List<Account> getAllAcount_DB() {
		List<Account> accountlList = new ArrayList<Account>();
//		Connnect DB to Get All Data From Account
		return accountlList;
	}

// Lấy danh sách Account được tạo trong tháng này
	public List<Account> processDataAccount(List<Account> accountlList) {
		List<Account> sub_accountList = new ArrayList<Account>();
//		...
//		Processing logic to get the required data
		return sub_accountList;
	}

//	Hàm Hiển thị danh sách Account theo Dữ liệu truyền vào
	public void printAccount(List<Account> accountlList) {
		System.out.println("Danh sách Account đang có là:");
		System.out.println("...");
	}

//	...
//	...
//	...
}

package com.vti.backend;

import com.vti.dao.IAccDAO;
import com.vti.entiy.Account;

public class Account_Backend {
	private IAccDAO accDAO;

	public Account_Backend(IAccDAO anyDB) {
		super();
		accDAO = anyDB;
	}

	public Boolean createAccount() {
//		Validate
//		...
//		...
		Account account = new Account(1, "daonq");
//		Tạo mới account sử dụng JDBC
//		IAccDAO accDAO = new AccDAO_JDBC();
//		boolean resultCreateAccount = accDAO.createNew_Account(account);
//		Tạo mới account sử dụng Hibernate
//		IAccDAO accDAO = new AccDAO_Hibernate();
		boolean resultCreateAccount = accDAO.createNew_Account(account);
		return resultCreateAccount;

	}

	public void getAllAccount() {
//		Validate
//		...
//		...
		Account account = new Account(1, "daonq");
//		Tạo mới account sử dụng JDBC
//		IAccDAO accDAO = new AccDAO_JDBC();
//		boolean resultCreateAccount = accDAO.createNew_Account(account);
//		Tạo mới account sử dụng Hibernate
//		IAccDAO accDAO = new AccDAO_Hibernate();
//		boolean resultCreateAccount = accDAO.createNew_Account(account);
//		return resultCreateAccount;

	}

}

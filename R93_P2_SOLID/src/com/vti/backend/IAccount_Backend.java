package com.vti.backend;

import java.util.Date;
import java.util.List;

import com.vti.entity.Account;

public interface IAccount_Backend {
//	Các phương thức CRUD cơ bản
	public List<Account> getAllAcount();

	public Boolean insertAccount(Account account);

	public Boolean deleteAccount(int id);

	public Boolean updateAccount(int id);

//	Các phương thức dùng để thống kê Accounts
	public List<Account> getAllAcountInMonht(Date date_month);

	public List<Account> getAllAcountInYear(Date date_Year);

	public List<Account> getAllAcountofDepartment(int dep_Id);

}

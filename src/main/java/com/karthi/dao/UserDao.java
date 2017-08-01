package com.karthi.dao;

import java.util.List;

import com.karthi.bean.PhoneBook;

public interface UserDao {

	public boolean addUser(PhoneBook phoneBook);
	
	public List<PhoneBook> getUsers();

}

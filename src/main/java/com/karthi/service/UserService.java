package com.karthi.service;

import java.util.List;

import com.karthi.bean.PhoneBook;

public interface UserService {
	public boolean addUser(PhoneBook phonebook);

	public List<PhoneBook> getUsers();
}

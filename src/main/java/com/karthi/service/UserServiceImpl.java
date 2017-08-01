package com.karthi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthi.bean.PhoneBook;
import com.karthi.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	 private UserDao userDao;

	@Override
	public boolean addUser(PhoneBook phonebook) {
		// TODO Auto-generated method stub
		return userDao.addUser(phonebook);
	}

	@Override
	public List<PhoneBook> getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUsers();
	}
	


}

package com.karthi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthi.dao.LoginDao;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	 private LoginDao loginDao;
	
	public boolean validateUser(String user, String password) {
		boolean b =loginDao.checkUser(user, password); 
		return b;
	}

}

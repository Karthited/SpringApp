package com.karthi.service;

import org.springframework.stereotype.Service;

public interface LoginService {
	public boolean validateUser(String user, String password);
}

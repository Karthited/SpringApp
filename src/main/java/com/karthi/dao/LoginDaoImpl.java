package com.karthi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	
	public boolean checkUser(String userName,String password) 
	{
		boolean st =false;
		try{
			SqlRowSet rs = jdbcTemplate.queryForRowSet("select * from logintable where username=? and password=?", userName,password);
			st = rs.next();
			System.out.println("####Status######"+st);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return st;
	}
}

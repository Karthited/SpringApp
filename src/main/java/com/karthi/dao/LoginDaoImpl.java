package com.karthi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {
	public boolean checkUser(String userName,String password) 
	{
		boolean st =false;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@PC333918:1521:XE","karthik","karthik");
			PreparedStatement ps =con.prepareStatement
					("select * from logintable where username=? and password=?");
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs =ps.executeQuery();
			st = rs.next();
			System.out.println("####Status######"+st);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return st;
	}
}

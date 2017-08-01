package com.karthi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.karthi.bean.PhoneBook;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	public boolean addUser(PhoneBook phoneBook) 
	{
		boolean st =false;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@PC333918:1521:XE","karthik","karthik");
			Statement stmt =con.createStatement();
			System.out.println(phoneBook.getDateOfBirth());
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			String newDateString = df.format(phoneBook.getDateOfBirth());
			int i = stmt.executeUpdate("insert into phonebook values ('"+phoneBook.getFirstname()+"','"+phoneBook.getEmail()+"','"+phoneBook.getPhone()+"',TO_DATE('"+newDateString+"', 'dd/mm/yyyy'))");
			if(i>0){                
				System.out.println("Inserted Successfully");
				st =true;
			}
				else
				System.out.println("Inserted UnSuccessfull");        
				      
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return st;
	}
	
	public List<PhoneBook> getUsers() 
	{
		List<PhoneBook> users = new ArrayList<>();
		boolean st =false;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@PC333918:1521:XE","karthik","karthik");
			PreparedStatement ps =con.prepareStatement
					("select * from phonebook");
			ResultSet rs =ps.executeQuery();
			while(rs.next()){
				PhoneBook phoneBook = new PhoneBook();
				phoneBook.setFirstname(rs.getString(1));
				phoneBook.setEmail(rs.getString(2));
				phoneBook.setPhone(Integer.parseInt(rs.getString(3)));
				//DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(rs.getString(4));
				phoneBook.setDateOfBirth(date);
				users.add(phoneBook);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return users;
	}
}

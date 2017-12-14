package com.struts.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.*;
import com.struts.demo.action.RegistrationAction;

public class RegisteredData {
	
	public static int save(RegistrationAction r) {
		int status=0; 
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
			System.out.println("Preparing a statement...");
			ResultSet rs = con.createStatement();
			PreparedStatement ps=con.prepareStatement("select * from user");
			ps.setString(1,r.getFirstName()); 
			ps.setString(2,r.getLastName());
			ps.setString(3,r.getDob());
			ps.setString(4,r.getEmail());
			ps.setString(5,r.getGender());
			status=ps.executeUpdate();
		 }
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}

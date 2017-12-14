package com.struts.demo.dao;

import java.sql.*;
import com.struts.demo.action.RegistrationAction;

public class RegisterDao {
	
	public static int save(RegistrationAction r) {
		int status=0; 
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
			System.out.println("Preparing a statement...");
			PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?)");
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

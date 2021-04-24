package com.loki.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.loki.model.Admin;

public class AdminDao {
   public Admin getAdmin(String name) {
		Admin admin = new Admin();
	   try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","loki");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from admin where admin_name = '"+name+"'");
			while(rs.next()) {
				admin.setName(rs.getString("admin_name"));
				admin.setPassword(rs.getString("password"));
			}
			}
			catch(Exception e) {
				System.out.println(e);	
		  }
	   return admin;
   }
	
	
}

package com.loki.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoDao {
  
	public String getName() {
		try {
		String name="";
 		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","loki");
		Statement st = con.createStatement();
		ResultSet  rs = st.executeQuery("select * from students where roll_no = '21f203'");
		while(rs.next()) {
			 name = rs.getString("name");
		}
		return name;
		} 
		catch (Exception e) {
			
			return e.toString();
		}
		
	}
//	public static void main(String[] args) {
//		 String name = getName();
//		 System.out.println(name);
//	}
	
}

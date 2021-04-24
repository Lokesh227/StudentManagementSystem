package com.loki.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.loki.model.Student;

public class StudentDao {
	Student student = new Student();
	Connection con;
	Statement st;
	public Connection getConnection() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","loki");
		
		}
		catch(Exception e) {
			System.out.println(e);	
			}
		return con;
	}
	public List<Student> getAllStudents(){
		List<Student> list = new ArrayList<Student>();
		 con = getConnection();
		 try {
		 st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from student");
			
			while(rs.next()) {
				 Student student = new Student();
				 student.setRollNo(rs.getString("rollno"));
				 student.setName(rs.getString("name"));
				 student.setEmail(rs.getString("email"));
				 student.setPhone(rs.getString("phone"));
				 student.setDepartment(rs.getString("department"));
				 list.add(student);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		 return list;
		
	}
	public Student getStudent(String rollno) throws Exception {
		 con = getConnection();
		 st = con.createStatement();
		 ResultSet rs = st.executeQuery("Select * from student where rollno ='"+rollno+"'");
		 while(rs.next()) {
			 student.setRollNo(rs.getString("rollno"));
			 student.setName(rs.getString("name"));
			 student.setEmail(rs.getString("email"));
			 student.setPhone(rs.getString("phone"));
			 student.setDepartment(rs.getString("department"));
			 
		 }
		 return student;
	}
	public int addStudent(Student student) {
		int b = 0;
		try {
		con = getConnection();
		st = con.createStatement();
		 b = st.executeUpdate("insert into student values('"+student.getRollNo()+"','"+student.getName()+"','"+student.getEmail()+"','"+student.getPhone()+"','"+student.getDepartment()+"')");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
	}
	public int deleteStudent(String rollno) {
		int b = 0;
		try {
			con = getConnection();
			st = con.createStatement();
			 b = st.executeUpdate("delete from student where rollno = '"+rollno+"'");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
	}
	public int updateName(String rollno,String name) {
		int b = 0;
		try {
			con = getConnection();
			st = con.createStatement();
			b = st.executeUpdate("update student set name ='"+name+"' WHERE rollno = '"+rollno+"'");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
	}
	public int updateEmail(String rollno,String email) {
		int b = 0;
		try {
			con = getConnection();
			st = con.createStatement();
			b = st.executeUpdate("update student set email ='"+email+"' WHERE rollno = '"+rollno+"'");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
	}
	public int updatePhone(String rollno,String phone) {
		int b = 0;
		try {
			con = getConnection();
			st = con.createStatement();
			b = st.executeUpdate("update student set phone ='"+phone+"' WHERE rollno = '"+rollno+"'");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
	}
	public int updateDepartment(String rollno,String department) {
		int b = 0;
		try {
			con = getConnection();
			st = con.createStatement();
			b = st.executeUpdate("update student set department ='"+department+"' WHERE rollno = '"+rollno+"'");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
	}
	
	
	public static void main(String[] args) throws Exception {
		StudentDao sd= new StudentDao();
		Student student  = new Student();
		student.setRollNo("18f201");
		student.setName("Abdulla");
		student.setEmail("ab@gmail.com");
		student.setPhone("99089897");
		student.setDepartment("IT");
	   // System.out.println(sd.addStudent(student));
		
//		System.out.println(sd.updatePhone("18f201","9998989"));
//		System.out.println(sd.updateDepartment("18f201","CSE"));
		
		System.out.println(sd.getAllStudents());
		
//		System.out.println(sd.getStudent("18f201"));
		//System.out.println(sd.deleteStudent("18f201"));
	}
}

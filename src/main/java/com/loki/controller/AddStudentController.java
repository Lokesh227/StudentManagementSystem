package com.loki.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loki.dao.StudentDao;
import com.loki.model.Student;


public class AddStudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rollno = request.getParameter("rollno");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String department = request.getParameter("department");
		
		Student student = new Student();
		student.setRollNo(rollno);
		student.setName(name);
		student.setEmail(email);
		student.setPhone(phone);
		student.setDepartment(department);
		
		StudentDao dao = new StudentDao();
		 System.out.print(student);
		int i = dao.addStudent(student);
		if(i==1 ) {
		   HttpSession session = request.getSession(); 
		   session.setAttribute("message", "Successfully Added..!");
		   response.sendRedirect("success.jsp");
		}
		else {
			HttpSession session = request.getSession(); 
			   session.setAttribute("message", "Duplicate Entry..! or Missing fields");
			 response.sendRedirect("failure.jsp");
		}
		
		
	}

}

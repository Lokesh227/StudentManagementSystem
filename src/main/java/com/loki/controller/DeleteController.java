package com.loki.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loki.dao.StudentDao;

public class DeleteController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String rollno = request.getParameter("rollno");
		 
		 StudentDao  dao = new StudentDao();
		 int n = dao.deleteStudent(rollno);
		 if(n==1) {
			 HttpSession session = request.getSession(); 
			 session.setAttribute("message", "Successfully Deleted..!");
			 response.sendRedirect("success.jsp");
		 }
		 else {
			 HttpSession session = request.getSession();
			 session.setAttribute("message", "Not found/Failed:(");
			 response.sendRedirect("failure.jsp");
		 }
	}

}

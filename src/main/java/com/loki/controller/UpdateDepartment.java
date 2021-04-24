package com.loki.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loki.dao.StudentDao;

public class UpdateDepartment extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rollno = request.getParameter("rollno");
		String department = request.getParameter("department");
		
		StudentDao dao = new StudentDao();
		
		int n = dao.updateDepartment(rollno, department);
		
		if(n==1) {
			HttpSession session = request.getSession();
			session.setAttribute("message", "Successfully Updated :)");
			response.sendRedirect("success.jsp");
		}
		else
		{
			HttpSession session = request.getSession();
			session.setAttribute("message", "Failed:(");
			response.sendRedirect("failure.jsp");
		}
	}

}

package com.loki.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loki.dao.StudentDao;
import com.loki.model.Student;

public class ViewController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentDao dao = new StudentDao();
		List<Student> list = new ArrayList<Student>();
		list = dao.getAllStudents();
		HttpSession session = request.getSession();
		session.setAttribute("students", list);
		response.sendRedirect("view.jsp");
	}	

}

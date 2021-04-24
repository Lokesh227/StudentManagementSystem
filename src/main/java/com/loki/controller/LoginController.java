package com.loki.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loki.dao.AdminDao;
import com.loki.model.Admin;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		AdminDao adao = new AdminDao();
		Admin admin= adao.getAdmin(name);
		String adminPassword = admin.getPassword();
		if(password.equals(adminPassword) ) {
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			response.sendRedirect("show.jsp");
		}
		else if(name.isEmpty() || password.isEmpty()) {
			String error = "Please provide details";
			HttpSession session = request.getSession();
			session.setAttribute("error", error);
			response.sendRedirect("index.jsp");
		}
		else
		{
			String error = "Username or Password is Wrong";
			HttpSession session = request.getSession();
			session.setAttribute("error", error);
			response.sendRedirect("index.jsp");
		}
		
		
	}

}

package com.loki.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loki.dao.DemoDao;

/**
 * Servlet implementation class DemoController
 */
public class DemoController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str = request.getParameter("name");
		
		DemoDao dao = new DemoDao();
		 String n= dao.getName();
		 HttpSession session = request.getSession();
		 session.setAttribute("name",n); 
		response.sendRedirect("show.jsp");
		
	}


}

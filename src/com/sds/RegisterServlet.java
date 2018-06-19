package com.sds;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/RegisterServlet", "/register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("InvokeGetMethod");
		String id = request.getParameter("rid");
		String pwd = request.getParameter("rpwd");
		String name = request.getParameter("rname");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String sex = request.getParameter("male");
		String birthday = request.getParameter("date");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("InvokePostMethod");
		String id = request.getParameter("rid");
		String pwd = request.getParameter("rpwd");
		String name = request.getParameter("rname");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String sex = request.getParameter("male");
		String birthday = request.getParameter("date");
		name = new String(name.getBytes("8859_1"),"KSC5601");
		
		System.out.println(id+" "+pwd+" "+name+" "+tel+" "+email+" "+sex+" "+birthday);
		response.sendRedirect("login.html");
	
	}

}

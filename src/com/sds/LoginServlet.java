package com.sds;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Login Try via Post Method");
		
		String id = request.getParameter("rid");
		String pwd = request.getParameter("rpwd");
		System.out.println(id+pwd);
		if(id.equals("id01") && pwd.equals("pwd01")) {
			response.sendRedirect("loginSuccess.html");
		}
		else {
			response.sendRedirect("loginFail.html");
			
		}
	}

}

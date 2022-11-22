package com.chukki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/square")
public class SquareServlet extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

	//HttpSession session = req.getSession();
	
	int k = 0;
	Cookie[] arr = req.getCookies();
	
	for(Cookie c : arr) {
		if(c.getName().equals("kvalue")) {
			k = Integer.parseInt(c.getValue());
		}
	}
	
	//int k = (int) session.getAttribute("kvalue");
	
	//int k = Integer.parseInt(req.getParameter("k"));
	
	
	//int k = (int) req.getAttribute("kvalue");
	
	int l = k*k;
	
	PrintWriter out = res.getWriter();
	out.println("The value of square is " + l);
	
	
}
}

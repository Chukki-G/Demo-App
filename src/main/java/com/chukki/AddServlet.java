package com.chukki;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	//regular method
	//doPost will only accept post request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		//using cookies
		Cookie cookie = new Cookie("kvalue",k+"");
		res.addCookie(cookie);
		res.sendRedirect("square");
		
		//Using session
		/*HttpSession session = req.getSession();
		session.setAttribute("kvalue", k);
		res.sendRedirect("square");
		
		//URL rewritting 
		//res.sendRedirect("square?k="+k);  
		
		/*req.setAttribute("kvalue", k);
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);*/
		
		
		ServletContext ctx = getServletContext();
		ctx.getInitParameter("name");
		
		ServletConfig cgf = getServletConfig();
		cgf.getInitParameter("name");
		
	}
	
}

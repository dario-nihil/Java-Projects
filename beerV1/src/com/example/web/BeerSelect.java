package com.example.web;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletResponse;

public class BeerSelect extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String beerColor = request.getParameter("color");
		out.println("Beer Selection Advice<br />");
		out.println("<br />Got beer color: " + beerColor);
	}

}

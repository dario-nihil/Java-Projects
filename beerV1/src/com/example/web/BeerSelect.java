package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

public class BeerSelect extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String beerColor = request.getParameter("color");
		BeerExpert expert = new BeerExpert();
		List<String> be = expert.getBrands(beerColor);
		out.println("Beer Selection Advice<br />");
		for (String aBeer : be) {
			out.print("<br />Try: " + aBeer);
		}

	}

}

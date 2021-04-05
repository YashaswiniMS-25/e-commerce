package com.wolken.wolkenapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/prod")
public class ProductServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String mobilename=req.getParameter("mb");
		String quantity=req.getParameter("qt");
	
		//int quantity=Integer.parseInt(quant);
		
		req.setAttribute("mn", mobilename);
		req.setAttribute("quant", quantity);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/final");
		dispatcher.forward(req,resp);
	}
	
	
	
	

}

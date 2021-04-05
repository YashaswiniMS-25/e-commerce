package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/final")
public class Final extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		/*
		 * String mobilename=req.getParameter("mn"); String
		 * quantity=req.getParameter("qt");
		 */
		
		String mbname=(String) req.getAttribute("mn");
	String quan	=(String) req.getAttribute("quant");
		int price=(Integer.parseInt(quan)*54000);
		PrintWriter printwriter = resp.getWriter();
		
		 printwriter.print("Thank you for shopping, total cost"+price);
		 printwriter.flush();
		 printwriter.close();
		 
		
		
		


		
	}

}

package com.ssi.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ProductControllerTwo {
/*
	@RequestMapping("/process")
	public void processRequest(@RequestParam("t1") int income, @RequestParam("t2") int age, HttpServletResponse response) {
		
		//process the data
		int tax=0;
		if(income>=500000) {
			tax=income*20/100;
		}else {
			tax=income*10/100;
		}
		//provide the response
		try {
			PrintWriter out=response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>Tax-Details</h3>");
			out.println("<h4>Income : "+income+"</h4>");
			out.println("<h4>Age : "+age+"</h4>");
			out.println("<h4>Tax : "+tax+"</h4>");
			out.println("</body>");
			out.println("</html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@RequestMapping("/inputs")
	public String showInputPage() {
		//when you will click on link (know-your-tax) , url will be /inputs, for handling request this method will called
		//this method will not process anything but it just need to show a inputpage to user (view)
		//it will return the name of the view to front-controller.
		//whatever we are returning through this method , is actually returned to DispatcherServlet
		return "details.jsp";	//here details.jsp is name of view
		
	}
*/	
}

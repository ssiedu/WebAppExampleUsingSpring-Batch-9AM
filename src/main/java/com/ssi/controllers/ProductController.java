package com.ssi.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssi.models.TaxModel;
import com.ssi.services.TaxService;

@Controller
public class ProductController {
	
	
	@Autowired
	private TaxService service;
	
	@RequestMapping("/process")
	public void processRequest(@ModelAttribute TaxModel model, HttpServletResponse response) {
		
		service.computeTax(model);
		
		//provide the response
		try {
			PrintWriter out=response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>Tax-Details</h3>");
			out.println("<h4>Income : "+model.getIncome()+"</h4>");
			out.println("<h4>Age : "+model.getAge()+"</h4>");
			out.println("<h4>Tax : "+model.getTax()+"</h4>");
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
	
}

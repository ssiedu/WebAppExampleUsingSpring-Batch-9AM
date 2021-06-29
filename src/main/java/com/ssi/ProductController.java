package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/process")
	public void processRequest(HttpServletRequest request, HttpServletResponse response) {
		//when you will submit the form, url will get appended by /process and for handling this method will get called
		
		//will read the request-param
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		int income=Integer.parseInt(s1);
		int age=Integer.parseInt(s2);
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
	
}

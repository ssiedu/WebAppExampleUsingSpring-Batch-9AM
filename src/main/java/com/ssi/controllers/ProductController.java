package com.ssi.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.models.TaxModel;
import com.ssi.services.TaxService;

@Controller
public class ProductController {
	
	
	@Autowired
	private TaxService service;
	
	@RequestMapping("/process")
	public ModelAndView processRequest(@ModelAttribute("info") TaxModel model) {
		service.computeTax(model);
		ModelAndView mv=new ModelAndView("result.jsp");
		mv.addObject("author","manoj");	
		return mv;
	}
	
	
	@RequestMapping("/inputs")
	public String showInputPage() {
		//when you will click on link (know-your-tax) , url will be /inputs, for handling request this method will called
		//this method will not process anything but it just need to show a input page to user (view)
		//it will return the name of the view to front-controller.
		//whatever we are returning through this method , is actually returned to DispatcherServlet
		return "details.jsp";	//here details.jsp is name of view
		
	}
	
}

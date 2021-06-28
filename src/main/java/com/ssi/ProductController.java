package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/company")
	public void provideCompanyInfo() {
		System.out.println("Handling Company Request.............!");
	}
	
	@RequestMapping("/address")
	public void provideAddressInfo() {
		System.out.println("Handling Address Request.............!");
	}
	
	@RequestMapping("info")
	public void provideGeneralInfo() {
		System.out.println("Handling Info Request.............!");
	}
}

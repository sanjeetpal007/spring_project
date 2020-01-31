package com.pal.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		
		return "fancy-login";
		
	}
	
	//add request mapping for /acces-denied
	@GetMapping("/access-denied")
	public String showAccess_denied() {
		return "access-denied";
	}
}

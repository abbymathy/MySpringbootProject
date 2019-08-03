package com.StartedWeb.WebStarterProject.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/Welcome")
	public String welcome() {
		return "Welcome to my first wen project....";
	}

}

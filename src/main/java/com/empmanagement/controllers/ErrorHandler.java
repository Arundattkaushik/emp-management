package com.empmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class ErrorHandler {

	@ExceptionHandler (value = Exception.class)
	public String error() {
		return "redirect:/error-page";
	}
	
	
}

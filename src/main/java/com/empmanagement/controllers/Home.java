package com.empmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.empmanagement.entities.Employee;
import com.empmanagement.services.Service;

@Controller
public class Home {

	@RequestMapping(path = "/home")
	public void home() {
		
	}
	
	@RequestMapping(path = "/sign-up")
	public void signUp() {
		
	}
	
	
	@RequestMapping(path = "/create-user", method = RequestMethod.POST)
	public String createUser(@ModelAttribute("employee") Employee employee, ModelAndView view, BindingResult result) {
		Service.saveEmployee(employee);
		view.addObject("emp", employee);
		return "redirect:/user-home";
	}
	
	
	@RequestMapping("/user-home")
	public void userHome() {
		
	}
}

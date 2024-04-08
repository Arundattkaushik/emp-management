package com.empmanagement.controllers;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.empmanagement.entities.Employee;
import com.empmanagement.services.Service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Home {

	@RequestMapping(path = "/home")
	public void home() {
		
	}
	
	@RequestMapping(path = "/sign-up")
	public void signUp() {
		
	}
	
	
	@RequestMapping(path = "/create-user", method = RequestMethod.POST)
	public String createUser(@ModelAttribute("employee") Employee employee, BindingResult result, HttpSession session) {
		Service.saveEmployee(employee);
		return "redirect:/home";
	}
	
	
	@RequestMapping("/user-home")
	public void userHome(Employee employee, HttpServletRequest request) {
		
	}
	
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, HttpServletRequest request) {
		Employee employee = Service.getEmpByEmailAndPassword(email, password);
		
		
		if (employee==null) {
			return "redirect:/home";
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("emp", employee);
			return "redirect:/user-home";	
		}
	}
	
	
	@RequestMapping(path = "/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("emp");
		return "redirect:/home";
	}
	
	
	@RequestMapping(path = "/emp-details")
	public void empDetails() {
		
	}
	
	
	@RequestMapping(path = "/update-details", method = RequestMethod.POST)
	public String updateDetails(
			@RequestParam("emp_id") int id, 
			@RequestParam("name") String name,
			@RequestParam("mobile") String mobile,
			@RequestParam("empType") String empType,
			@RequestParam("gender") String gender,
			@RequestParam("dob") String dob
			) 
	{
		Employee emp = Service.getEmployee(id);
		emp.setId(id);
		emp.setName(name);
		emp.setEmail(emp.getEmail());
		emp.setPassword(emp.getPassword());
		emp.setMobile(mobile);
		emp.setEmpType(empType);
		emp.setGender(gender);
		emp.setDob(dob);
		Service.updateEmployee(emp);
		return "redirect:/user-home";
	}
	
	
	@RequestMapping("/verify-email")
	public void email() {
		
	}
	
	
	@RequestMapping("/check-email")
	public String checkEmail(@RequestParam("email") String email, HttpServletRequest request) {
		Boolean b = Service.verifyEmail(email);
		HttpSession session = request.getSession();
		if (b==true) {
			session.setAttribute("email", email);
			return "redirect:/set-password";
		}
		else {	
			return "redirect:/verify-email";
		}
	}
	
	
	@RequestMapping("/set-password")
	public void password() {
		
	}
	
	
	@RequestMapping("/update-password")
	public String updatePassword(@RequestParam("password") String password, @RequestParam("confirm_password") String confirm_password, HttpServletRequest request) {
		if (password.equals(confirm_password)) {
			HttpSession session = request.getSession();
			String em = (String) session.getAttribute("email");
			Service.updatePassword(password, em);
			session.removeAttribute("email");
			return "redirect:/home";
		} 
		else {
			return "redirect:/set-password";
		}
	}
}

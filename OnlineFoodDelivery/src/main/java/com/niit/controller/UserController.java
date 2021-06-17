package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.model.Customer;
import com.niit.service.UserService;

@Controller
public class UserController {
	
	@Autowired 
	UserService userService;
	
	@PostMapping("/Register")
	public String registeruser(@ModelAttribute("customer") Customer customer)
	{
		
		boolean result = userService.registeruser(customer);
		if(result)
		{
			return "login";
		}
		else
		{
			return "redirect:/Register";
		}
		
	}
	
	@GetMapping("/adminlogin")
	public String login(@RequestParam("name") String name,@RequestParam("password")String password) {
		
		boolean result = userService.login(name,password);
		if(result)
		{
			return "adminmenu";
		}
		else
		{
			return "redirect:/login";
		}
	}
	

}

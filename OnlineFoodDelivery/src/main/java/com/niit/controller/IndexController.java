package com.niit.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	@RequestMapping("/contentframe")
	public String contentFrame() {
		return "contentframe";
	}
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
	@RequestMapping("/menu")
	public String menuPage() {
		return "menu";
	}
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	@RequestMapping("/order")
	public String order() {
		return "order";
	}
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	@RequestMapping("/reservation")
	public String reservation() {
		return "reservation";
	}
	@RequestMapping("/onlinedelivery")
	public String onlinedelivery() {
		return "onlinedelivery";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/Register")
	public String Register() {
		return "Register";
	}
	@RequestMapping("/viewAllReservation")
	public String viewAllReservation() {
		return "viewAllReservation";
	}
	
	
	
	
	
}

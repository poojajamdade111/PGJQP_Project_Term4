package com.niit.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.model.FoodOrder;
import com.niit.model.ReservationEntry;
import com.niit.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
		@PostMapping("/order")
		public String orderfood(@ModelAttribute("foodOrder") FoodOrder foodOrder)
		{
			
			boolean result = orderService.orderfood(foodOrder);
			if(result)
			{
				return "payment_success";
			}
			else
			{
				return "redirect:/order";
			}
			
		}
	
		@PostMapping("/reservation")
		public String reserveTable(@ModelAttribute("reservationEntry") ReservationEntry reservationEntry)
		{
		
			boolean result = orderService.reserveTable(reservationEntry);
			if(result)
			{
				return "registration_sucess";
			}
			else
			{
				return "redirect:/reservation";
			}
		}
		
		@GetMapping("/viewAllOrders")
		public String viewAllFoodOrder(Model model)
		{
			List<FoodOrder> allfoodOrder = orderService.getAllFoodOrder();
			model.addAttribute("foodOrder", allfoodOrder);
			return "viewAllOrders";
		}
		@GetMapping("/viewAllReservation")
		public String viewAllReservation(Model model)
		{
			List<ReservationEntry> allReservationEntry = orderService.getAllReservationEntry();
			model.addAttribute("allReservationEntry", allReservationEntry);
			return "viewAllReservation";
		}
	}
	



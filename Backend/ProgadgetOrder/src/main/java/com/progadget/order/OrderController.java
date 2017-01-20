package com.progadget.order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	
	@RequestMapping(value = "/placeOrder/{emailId}/{userName}") 
	public String placeOrder(@PathVariable String emailId, @PathVariable String userName) {
		return orderService.placeOrder(emailId, userName);
	}
	
	
}	
	


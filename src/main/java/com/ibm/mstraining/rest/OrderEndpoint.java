package com.ibm.mstraining.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.mstraining.model.Order;
import com.ibm.mstraining.model.ShoppingCart;
import com.ibm.mstraining.service.OrderService;

@RestController
public class OrderEndpoint {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/order-service/placeOrder")
	public Order placeOrder(@RequestBody ShoppingCart cart)
	{
		return orderService.placeOrder(cart);
		
	}
}

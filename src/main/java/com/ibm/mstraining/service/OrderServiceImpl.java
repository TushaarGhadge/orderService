package com.ibm.mstraining.service;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.mstraining.model.Order;
import com.ibm.mstraining.model.ShoppingCart;


@Component
public class OrderServiceImpl implements OrderService {
	@Autowired
	private Order order;
	Random rnd = new Random();
	Calendar c = Calendar.getInstance();
   
	@Override
	public Order placeOrder(ShoppingCart cart) {
		Date currentDate = new Date();
		c.setTime(currentDate);
		c.add(Calendar.DATE, rnd.nextInt(7)); 
		Date expctedDeliveryDate = c.getTime();
		order.setId(rnd.nextInt());
		order.setCart(cart);
		order.setClientId(cart.getClientId());
		order.setOrderDate(currentDate);
		order.setExpectedDeliveyDate(expctedDeliveryDate);
		
		return order;
	}

}

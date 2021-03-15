package com.ibm.mstraining.service;

import com.ibm.mstraining.model.Order;
import com.ibm.mstraining.model.ShoppingCart;

public interface OrderService {
	public Order placeOrder(ShoppingCart cart);
}

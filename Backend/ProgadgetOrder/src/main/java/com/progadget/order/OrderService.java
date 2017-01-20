package com.progadget.order;

import org.springframework.stereotype.Service;

@Service
public interface OrderService {
	public String placeOrder(String emailId, String userName);
}



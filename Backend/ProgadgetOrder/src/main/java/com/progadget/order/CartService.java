package com.progadget.order;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CartService {
	
	public List<Cart>  getAllCarts();
	public void deleteCart(int id);
}

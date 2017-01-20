package com.progadget.order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartDao cartDao;
	
	@Override
	public List<Cart> getAllCarts() {
		List<Cart> carts = new ArrayList<>();
		cartDao.findAll().forEach(carts::add);
		return carts;
	}

	@Override
	public void deleteCart(int id) {
		cartDao.delete(id);
	}
	
}

package com.progadget.order;


import java.util.Date;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Component
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private JavaMailSender javaMailService;
	
	@Override
	@Transactional
	public String placeOrder(String emailId, String userName) {
		Cart cart =  null;;
		if(cartService.getAllCarts() != null) {
			cart = cartService.getAllCarts().get(0);
		}
		if(cart != null) {
			Integer cartId = cart.getId();
			String orderDate = new Date().toString();
			Order order  = new Order(cartId, orderDate);
			Order savedOrder = orderDao.save(order);
			cartService.deleteCart(cartId);
			if(savedOrder != null) {
				
				SimpleMailMessage mailMessage=new SimpleMailMessage();
				createMailBody(mailMessage, emailId, userName, cart, savedOrder);
		        javaMailService.send(mailMessage);
		        return "Order placed successfully";
			} else {
				return "Sorry for the inconvinience : Your transaction could not be successful";
			}
			
			
		}
		return "Please add one item to place the order";
	}
	
	
	private void createMailBody(SimpleMailMessage mailMessage, String emailId, String userName, Cart cart, Order savedOrder) {
		mailMessage.setTo(emailId);
		mailMessage.setFrom("arghya.bhattacharya@coviam.com");
        mailMessage.setSubject("Order id "+savedOrder.getOrderId()+"  :  Order has been placed successfully");
        mailMessage.setText("Hello " +userName +"\n "+"Here is your order detail  \n"+"product name :"+cart.getProductName()
        +"\n "+"Cost of the product is  "+cart.getProductCost()+"\n  "+
        		"Product description is  "+cart.getProductDesc());
	}
	
	
}

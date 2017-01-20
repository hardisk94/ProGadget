package com.progadget.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetail")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name  = "id")
	private Integer orderId;
	
	@Column(name= "product_id")
	private Integer productId;
	
	@Column(name= "order_date")
	private String orderDate;
	
	public Integer getOrderId() {
		return orderId;
	}
	
	public Order() {
		
	}
	public Order(Integer productId, String orderDate) {
		this.productId = productId;
		this.orderDate = orderDate;
	}
	
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
}

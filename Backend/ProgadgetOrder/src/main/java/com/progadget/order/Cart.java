package com.progadget.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "product_name")
	private String productName;
	
	public Cart() {
		
	}
	
	public Cart(int id, String productName, Integer productCost, String productDesc) {
		super();
		this.id = id;
		this.productName = productName;
		this.productCost = productCost;
		this.productDesc = productDesc;
	}
	@Column(name = "product_cost")
	private Integer productCost;
	
	@Column(name = "product_img_url")
	private String productImageUrl;
	
	
	@Column(name = "product_desc")
	private String productDesc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductCost() {
		return productCost;
	}
	public void setProductCost(Integer productCost) {
		this.productCost = productCost;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	
	

}

package com.coviam.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by hardikbohra on 16/01/17.
 */
@Entity
@Table(name = "product")
public class Product implements Serializable, Comparable<Product> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_img_url")
    private String productImageUrl;
    @Column(name = "product_cost")
    private String productCost;
    @Column(name = "product_desc")
    private String productDesc;
    @Column(name = "category_id")
    private int categoryId;

    public Product(String name, String imgUrl, String cost, String desc, int categoryId) {
        this.productName = name;
        this.productImageUrl = imgUrl;
        this.productCost = cost;
        this.productDesc = desc;
        this.categoryId = categoryId;
    }

    public Product(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCost() {
        return productCost;
    }

    public void setProductCost(String productCost) {
        this.productCost = productCost;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Student { " +
                "Product Name : " + this.productName +
                "Product Image : " + this.productImageUrl +
                "Product Cost : " + this.productCost +
                "Product Description : " + this.productDesc + "}";
    }

	@Override
	public int compareTo(Product o) {
		return this.id- o.id;
	}
}

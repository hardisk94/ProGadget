package com.coviam.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by hardikbohra on 16/01/17.
 */
@Entity
@Table(name = "cart")
public class Cart implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_cost")
    private int productCost;

    @Column(name = "product_desc")
    private String productDesc;

    public Cart(){}

    public Cart(Product item) {
        this.productName = item.getProductName();
        this.productCost = Integer.parseInt(item.getProductCost());
        this.productDesc = item.getProductDesc();
    }

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
    public int getProductCost() {
        return productCost;
    }
    public void setProductCost(int productCost) {
        this.productCost = productCost;
    }
    public String getProductDesc() {
        return productDesc;
    }
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
}

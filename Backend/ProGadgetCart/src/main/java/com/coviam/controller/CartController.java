package com.coviam.controller;

import com.coviam.model.Cart;
import com.coviam.model.Product;
import com.coviam.service.CartService;
import com.coviam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hardikbohra on 16/01/17.
 */
@RestController
public class CartController {

    @Autowired
    private CartService cartService;
    @Autowired
    private ProductService prodService;

    @RequestMapping("/")
    public String index() {
        return "Hello..!!!";
    }

    @RequestMapping("/cartProducts")
    public List<Cart> displayAllCartProducts() throws Exception {
        List<Cart> productList = cartService.getAllCarts();
        return productList;
    }

    @RequestMapping("/addNewCartProduct/{productId}")
    public Product addNewProduct(@PathVariable int productId) throws Exception {
        Product cartProduct = prodService.getProductsById(productId);
        Cart newItem = new Cart(cartProduct);
        cartService.deleteAllFromCart();
        cartService.createNewCart(newItem);
        return cartProduct;
    }

    @RequestMapping("/cart/deleteProduct")
    public String deleteFromCart() throws Exception {
        cartService.deleteAllFromCart();
        return "Deleted";
    }
}

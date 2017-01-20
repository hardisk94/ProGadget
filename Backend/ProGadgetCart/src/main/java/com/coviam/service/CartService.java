package com.coviam.service;

import com.coviam.model.Cart;

import java.util.List;

/**
 * Created by hardikbohra on 16/01/17.
 */

public interface CartService {

    public List<Cart>  getAllCarts();
    public void deleteCart(int id);
    public void deleteAllFromCart();
    public void createNewCart(Cart newCart);
}


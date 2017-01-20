package com.coviam.service;

import com.coviam.dao.CartDAO;
import com.coviam.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hardikbohra on 16/01/17.
 */

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartDAO cartDao;

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

    @Override
    public void deleteAllFromCart() {
        cartDao.deleteAll();
    }

    @Override
    public void createNewCart(Cart newCart) {
        cartDao.save(newCart);
    }
}

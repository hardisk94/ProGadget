package com.coviam.dao;

import com.coviam.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hardikbohra on 16/01/17.
 */
@Repository
public interface CartDAO extends CrudRepository<Cart, Integer> {
}


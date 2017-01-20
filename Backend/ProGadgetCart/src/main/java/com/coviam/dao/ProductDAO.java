package com.coviam.dao;

import com.coviam.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hardikbohra on 12/01/17.
 */

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer> {
    public List<Product> findByCategoryId(int categoryId);
    public List<Product> findByProductName(String productName);
}

package com.coviam.service;


import com.coviam.model.Product;

import java.util.List;

/**
 * Created by hardikbohra on 12/01/17.
 */
public interface ProductService {
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(int category_id);
    List<Product> getProductByName(String searchString);
    Product getProductsById(int productid);
}

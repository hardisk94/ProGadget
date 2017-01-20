package com.coviam.service;


import com.coviam.model.Product;

import java.util.List;
import java.util.Set;

/**
 * Created by hardikbohra on 12/01/17.
 */
public interface ProductService {
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(int category_id);
    Set<Product> getProductByName(String searchString);
    Product getProductsById(int productid);
}

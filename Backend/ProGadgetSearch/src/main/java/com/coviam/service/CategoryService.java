package com.coviam.service;


import com.coviam.model.Category;
import com.coviam.model.Product;

import java.util.List;

/**
 * Created by hardikbohra on 12/01/17.
 */
public interface CategoryService {
    List<Category> getAllCategories();
    List<Product> getCategoryByName(String categoryName);
}

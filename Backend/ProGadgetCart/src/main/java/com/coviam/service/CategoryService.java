package com.coviam.service;


import com.coviam.model.Category;

import java.util.List;

/**
 * Created by hardikbohra on 12/01/17.
 */
public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryByName(String categoryName);
}

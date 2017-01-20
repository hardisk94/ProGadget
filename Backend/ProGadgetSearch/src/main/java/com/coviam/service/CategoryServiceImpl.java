package com.coviam.service;

import com.coviam.dao.CategoryDAO;
import com.coviam.dao.ProductDAO;
import com.coviam.model.Category;
import com.coviam.model.Product;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by hardikbohra on 12/01/17.
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDAO catDao;

    @Autowired
    ProductDAO productDao;

    @Override
    public List<Category> getAllCategories() {
        return Lists.newArrayList(catDao.findAll());
    }

    @Override
    public List<Product> getCategoryByName(String categoryName) {
        List<Product> products  = new ArrayList<>();
    	Category category =  catDao.findByCategoryNameContainingIgnoreCase(categoryName);
        if(category != null) {
        	int categoryId = category.getId();
        	productDao.findByCategoryIdOrderByProductCost(categoryId).forEach(products::add);
        }
        return products;
    }

}

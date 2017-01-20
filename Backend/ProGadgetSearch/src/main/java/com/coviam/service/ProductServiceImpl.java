package com.coviam.service;

import com.coviam.dao.CategoryDAO;
import com.coviam.dao.ProductDAO;
import com.coviam.model.Category;
import com.coviam.model.Product;


import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/**
 * Created by hardikbohra on 12/01/17.
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDAO prodDao;
    @Autowired
    CategoryDAO catDao;


    @Override
    public List<Product> getAllProducts() {
        return Lists.newArrayList(prodDao.findAll());
    }

    @Override
    public List<Product> getProductsByCategory(int categoryId) {
        return Lists.newArrayList(prodDao.findByCategoryIdOrderByProductCost(categoryId));
    }

    @Override
    public Product getProductsById(int productId) {
        return prodDao.findOne(productId);
    }

    @Override
    public Set<Product> getProductByName(String searchString) {
    	String[] splited = searchString.split("\\s+");
    	Set<Product> products = new TreeSet<>();
    	Set<String> nameSet  = new TreeSet<>();
    	for(int i = 0; i< splited.length; i++) {
    		nameSet.add(splited[i]);
    		
    	}
    	
    	if (nameSet.contains("in")) {
    		String productName  = splited[0];
    		String categoryName = splited[2];
    		Category category = catDao.findByCategoryNameContainingIgnoreCase(categoryName);
    		if(category != null) {
    			int categoryId = category.getId();
    			prodDao.findByProductNameContainingIgnoreCaseAndCategoryIdOrderByProductCost(productName, categoryId).forEach(products::add);
    			
    		}
    		
    	} else {
    		for(String productName : nameSet) {
            	prodDao.findByProductNameContainingIgnoreCaseOrderByProductCost(productName).forEach(products::add);
            }
    	}
        	
    	
    	return products;
    }
   
    
    
}

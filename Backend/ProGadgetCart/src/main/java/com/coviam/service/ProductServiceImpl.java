package com.coviam.service;

import com.coviam.dao.CategoryDAO;
import com.coviam.dao.ProductDAO;
import com.coviam.model.Product;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
        return Lists.newArrayList(prodDao.findByCategoryId(categoryId));
    }

    @Override
    public Product getProductsById(int productId) {
        return prodDao.findOne(productId);
    }

    @Override
    public List<Product> getProductByName(String searchString) {
        return Lists.newArrayList(prodDao.findByProductName(searchString));
    }

}

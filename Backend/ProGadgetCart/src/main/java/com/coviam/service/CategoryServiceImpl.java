package com.coviam.service;

import com.coviam.dao.CategoryDAO;
import com.coviam.model.Category;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by hardikbohra on 12/01/17.
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDAO catDao;


    @Override
    public List<Category> getAllCategories() {
        return Lists.newArrayList(catDao.findAll());
    }

    @Override
    public Category getCategoryByName(String categoryName) {
        return catDao.findByCategoryName(categoryName);
    }

}

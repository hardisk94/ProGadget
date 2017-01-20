package com.coviam.controller;

import com.coviam.model.Category;
import com.coviam.model.Product;
import com.coviam.service.CategoryService;
import com.coviam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * Created by hardikbohra on 16/01/17.
 */
@RestController
public class SearchController {

    @Autowired
    private ProductService prodService;
    @Autowired
    private CategoryService catService;


    @RequestMapping("/")
    public String index() {
        return "Hello..!!!";
    }

    @RequestMapping("/products")
    public List<Product> displayAllProducts() throws Exception {
        List<Product> productList = prodService.getAllProducts();
        return productList;
    }

    @RequestMapping("/categories")
    public List<Category> displayAllCategories() throws Exception {
        List<Category> categoryList = catService.getAllCategories();
        return categoryList;
    }

    /*@RequestMapping("/categories/getByName/{categoryName}")
    public Category getCategoryIdByName(@PathVariable String categoryName) throws Exception {
        Category returnedCategory = catService.getCategoryByName(categoryName);
        return returnedCategory;
    }*/

    @RequestMapping("/categories/getByName/{categoryName}")
    public List<Product> getCategoryIdByName(@PathVariable String categoryName) throws Exception {
       return catService.getCategoryByName(categoryName);
    }
    
    
    @RequestMapping("/products/getByCategoryId/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable Integer categoryId) throws Exception {
        List<Product> productList = prodService.getProductsByCategory(categoryId);
        return productList;
    }

    @RequestMapping("/products/getByName/{productName}")
    public Set<Product> getProductsByName(@PathVariable String productName) throws Exception {
        Set<Product> productList = prodService.getProductByName(productName);
        return productList;
    }

    @RequestMapping("/products/{productId}")
    public Product getProductsDetails(@PathVariable Integer productId) throws Exception {
        Product detailedProduct = prodService.getProductsById(productId);
        return detailedProduct;
    }
}

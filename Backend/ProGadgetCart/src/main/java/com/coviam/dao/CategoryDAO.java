package com.coviam.dao;

import com.coviam.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hardikbohra on 12/01/17.
 */

@Repository
public interface CategoryDAO extends CrudRepository<Category, Integer> {
    public Category findByCategoryName(String categoryName);
}

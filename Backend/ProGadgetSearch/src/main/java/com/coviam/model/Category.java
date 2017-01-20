package com.coviam.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by hardikbohra on 16/01/17.
 */
@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "category_img_url")
    private String categoryImageUrl;
    @Column(name = "category_created_dt")
    private String categoryCreatedDt;
    @Column(name = "category_updated_dt")
    private String categoryUpdatedDt;

    public Category(String name, String imgUrl, String createdDt, String updatedDt) {
        this.categoryName = name;
        this.categoryImageUrl = imgUrl;
        this.categoryCreatedDt = createdDt;
        this.categoryUpdatedDt = updatedDt;
    }
    public Category(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryImageUrl() {
        return categoryImageUrl;
    }

    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
    }

    public String getCategoryCreatedDt() {
        return categoryCreatedDt;
    }

    public void setCategoryCreatedDt(String categoryCreatedDt) {
        this.categoryCreatedDt = categoryCreatedDt;
    }

    public String getCategoryUpdatedDt() {
        return categoryUpdatedDt;
    }

    public void setCategoryUpdatedDt(String categoryUpdatedDt) {
        this.categoryUpdatedDt = categoryUpdatedDt;
    }

    @Override
    public String toString() {
        return "Student { " +
                "Category Name : " + this.categoryName +
                "Category Image : " + this.categoryImageUrl +
                "Category Created Date : " + this.categoryCreatedDt +
                "Category Updated Date : " + this.categoryUpdatedDt + "}";
    }
}

package com.shop.shopping.service;

import com.shop.shopping.model.Category;

import java.util.List;

public interface ICategoryService {

    Category getCategoryById(Long id);

    Category getCategoryByName(String name);

    List<Category> getAllCategories();

    Category addCategory(Category category);

    Category updateCategory(Category category);

    void deleteCategoryById(Long id);


}

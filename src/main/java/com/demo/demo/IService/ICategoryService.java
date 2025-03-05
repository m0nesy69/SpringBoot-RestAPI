package com.demo.demo.IService;

import java.util.List;

import com.demo.demo.entity.Category;

public interface ICategoryService {
	List<Category> getAllCategory();
	Category saveCategory(Category p);
	Category updateCategory(Category p);
    void deleteCategory(int id);
    Category getCategory(int id);
}

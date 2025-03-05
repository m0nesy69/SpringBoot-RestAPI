package com.demo.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.IService.ICategoryService;
import com.demo.demo.Repositories.CategoryRepository;
import com.demo.demo.entity.Category;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category saveCategory(Category p) {
		// TODO Auto-generated method stub
		return categoryRepository.save(p);
	}

	@Override
	public Category updateCategory(Category p) {
		// TODO Auto-generated method stub
		return categoryRepository.save(p);
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
	}

	@Override
	public Category getCategory(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id).orElse(null);
	}
}

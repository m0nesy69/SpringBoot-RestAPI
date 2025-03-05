package com.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.IService.ICategoryService;
import com.demo.demo.entity.Category;
import com.demo.demo.entity.Product;

@RestController
@RequestMapping("/category")
public class CategoryController {
  
	@Autowired
	private ICategoryService categoryservice;
	
	
	@PostMapping("/savecategories")
	public Category saveCategory( @RequestBody Category c) {
		Category result=null;
		try {
			result=categoryservice.saveCategory(c);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		return result;
	}
	
	@GetMapping("/showcategories")
	public List<Category> getAllCategory(){
		
		return categoryservice.getAllCategory();
	}
	
	@PutMapping("/updateCategory")
	public Category updateproduct(@RequestBody Category  c) {
		Category res=null;
		try {
			res=categoryservice.updateCategory(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return res;
	}
	@DeleteMapping("/deletecategory/{id}")
	public void deletercategory(@PathVariable int id) {
		try {
			categoryservice.deleteCategory(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}

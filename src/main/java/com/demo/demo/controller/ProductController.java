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

import com.demo.demo.IService.IProductService;
import com.demo.demo.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private IProductService productService;
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product pobj) {
		Product p=null;
		System.out.println("save");
		try {
		p=productService.saveProduct(pobj);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return p;
	}
	
	@GetMapping("/showproducts")
	public List<Product> showallProducts(){
		return productService.getAllProducts();
	}
	@PutMapping("/updateProduct")
	public Product updateproduct(@RequestBody Product  p) {
		Product res=null;
		try {
			res=productService.updateProduct(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return res;
	}
	@DeleteMapping("/deleteProduct/{id}")
	public void deleteproduct(@PathVariable int id) {
		
		try {
			productService.deleteProduct(id);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
}

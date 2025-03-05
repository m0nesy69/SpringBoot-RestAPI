package com.demo.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.IService.IProductService;
import com.demo.demo.Repositories.ProductRepo;
import com.demo.demo.entity.Product;



@Service
public class ProductService implements IProductService{

	
	@Autowired
    private ProductRepo productRepo;
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> productlist=productRepo.findAll();
		return productlist;
	}

	@Override
	public Product saveProduct(Product p) {
		// TODO Auto-generated method stub
		Product p1=productRepo.save(p);
		return p1;
	}

	@Override
	public Product updateProduct(Product p) {
		// TODO Auto-generated method stub
		if (productRepo.existsById(p.getId())) {
	        return productRepo.save(p); // Save and return updated product
	    } else {
	        throw new RuntimeException("Product not found with ID: " + p.getId());
	    }
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
		
	}

}

package com.demo.demo.IService;

import java.util.List;

import com.demo.demo.entity.Product;



public interface IProductService {
	List<Product> getAllProducts();
    Product saveProduct(Product p);
    Product updateProduct(Product p);
    void deleteProduct(int id);
}

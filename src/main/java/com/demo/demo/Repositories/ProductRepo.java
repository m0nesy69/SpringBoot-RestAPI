package com.demo.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo.entity.Product;



public interface ProductRepo extends JpaRepository<Product, Integer>{

}

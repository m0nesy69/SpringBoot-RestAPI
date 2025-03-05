package com.demo.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}

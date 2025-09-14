package com.springboot.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.product.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

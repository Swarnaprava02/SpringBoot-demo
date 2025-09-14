package com.springboot.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.product.dto.CategoryDTO;
import com.springboot.product.entity.Category;
import com.springboot.product.mapper.CategoryMapper;
import com.springboot.product.repository.CategoryRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryService {
	
	//@Autowired
	private CategoryRepository categoryRepository;
	//create category
	public CategoryDTO createCategory(CategoryDTO categoryDTO) {
		Category category=CategoryMapper.toCategoryEntity(categoryDTO);
		category=categoryRepository.save(category);
		return categoryDTO;
	}
		
	//get all category
	//get category by id
	//delete category
	
}

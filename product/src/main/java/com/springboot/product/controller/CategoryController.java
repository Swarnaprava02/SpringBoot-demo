package com.springboot.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.product.dto.CategoryDTO;
import com.springboot.product.service.CategoryService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {

	
    private	CategoryService categoryService;
	//get all Categories
	//createCategories
	
	@PostMapping 
	public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO) {
		return new ResponseEntity<>(categoryService.createCategory(categoryDTO),HttpStatus.CREATED);
	}
	//get category by id
	//delete category
}

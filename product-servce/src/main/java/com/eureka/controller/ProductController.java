package com.eureka.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.xml.bind.TypeConstraintException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.service.ProductService;
import com.eureka.vo.ProductVo;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("product")
	 void addproduct(@Valid @RequestBody ProductVo product) {
		productService.addProduct(product);

	}
	
	@GetMapping("search-product-name")
	List<ProductVo>  searchProductByName(@RequestBody String name) {
	return productService.searchProductByName(name);

	}
	
	@GetMapping("search-product-id")
	 List<ProductVo> searchProductById(@RequestBody String id) {
	return productService.searchProductByid(id);

	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleMethodArgException(MethodArgumentNotValidException methodArgExp) {
	
		HashMap<String, String> cacheMethodArgExp = new HashMap<>();
		methodArgExp.getAllErrors().forEach(exp->{
			cacheMethodArgExp.put(((FieldError)exp).getField(), ((FieldError)exp).getDefaultMessage());
		});
		
		return cacheMethodArgExp;

	}
}

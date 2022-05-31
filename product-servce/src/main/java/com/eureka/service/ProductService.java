package com.eureka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.ProductRepository;
import com.eureka.vo.ProductVo;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public void addProduct(ProductVo product) {
		productRepository.save(product);
	}
	
	public List<ProductVo> searchProductByid(String id) {
		// TODO Auto-generated method stub
		return productRepository.findByProductID(id);
	}
	
	public List<ProductVo>  searchProductByName(String name) {
		// TODO Auto-generated method stub
		return productRepository.findByProductName(name);
	}
}

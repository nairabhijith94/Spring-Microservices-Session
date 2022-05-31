package com.eureka;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eureka.vo.ProductVo;

@Repository
public interface ProductRepository extends JpaRepository<ProductVo, Integer>{

	public List<ProductVo>  findByProductName(String name);
	public List<ProductVo> findByProductID(String id);
}

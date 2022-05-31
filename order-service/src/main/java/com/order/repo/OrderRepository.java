package com.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.vo.OrderVo;

public interface OrderRepository extends JpaRepository<OrderVo, Integer>{

}

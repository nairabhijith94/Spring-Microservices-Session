package com.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.repo.OrderRepository;
import com.order.vo.OrderVo;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public void saveOrder(OrderVo order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);

	}

	public List<OrderVo> getOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}
}

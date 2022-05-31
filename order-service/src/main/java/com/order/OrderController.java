package com.order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.order.service.OrderService;
import com.order.vo.OrderVo;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/order")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createOrder(@Valid @RequestBody OrderVo order) {
		System.out.println(order.getItem());
		System.out.println(order.getQuantity());
		orderService.saveOrder(order);
		
	//	ResponseEntity<String> forEntity = restTemplate.getForEntity("http://EMAIL-SERVICE/email", String.class);
		ResponseEntity<String> forEntity = restTemplate.postForEntity("http://EMAIL-SERVICE/email", order.getEmail(), String.class);
		
		System.out.println(forEntity.getBody());
	}
	
	@GetMapping("orders")
	List<OrderVo> getorders() {
		// TODO Auto-generated method stub
		return orderService.getOrders();
	}
	
	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	private Map<String, String> handleException(MethodArgumentNotValidException notValidEx) {
//		HashMap<String, String> errorMsg = new HashMap<>();
//		notValidEx.getAllErrors().forEach(exe->{
//			errorMsg.put(((FieldError)exe).getField(), ((FieldError)exe).getDefaultMessage());
//		});
//		return errorMsg;
//	}

}

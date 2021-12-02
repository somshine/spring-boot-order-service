package com.somshine.orderService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.somshine.orderService.model.Order;
import com.somshine.orderService.repository.OrderRepository;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;

@RestController
@ApiModel(description="Order REST API interface")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@RequestMapping(value = "/order/v1/get/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Find Order by id", notes = "Return the Order Entity object.")
	public Order getOrder(@PathVariable Long id) {
		return orderRepository.findById(id).orElse(null);
	}
	
	@RequestMapping(value = "/order/v1/getOrderByCustomerId/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Find Orders by Customer Id", notes = "It's will return the all orders associated to the customers.")
	public List<Order> getOrderByCustomerId(@PathVariable int id) {
		return orderRepository.findByCustomerId(id);
	}
	
	@RequestMapping(value = "/order/v1/list", method = RequestMethod.GET)
	public List<Order> getOrders() {
		return orderRepository.findAll();
	}
	
	@RequestMapping(value = "/order/v1/customerWiseCount/{customerId}", method = RequestMethod.GET)
	public Long getOrderCountForCustomer(@PathVariable Integer customerId) {
		return orderRepository.countByCustomerId(customerId);
	}
}

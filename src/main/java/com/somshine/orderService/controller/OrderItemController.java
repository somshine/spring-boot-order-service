package com.somshine.orderService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.somshine.orderService.model.OrderItem;
import com.somshine.orderService.repository.OrderItemRepository;
import com.somshine.orderService.repository.OrderRepository;

@RestController
public class OrderItemController {
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@RequestMapping(value = "/orderitems/{orderId}", method = RequestMethod.GET)
	public List<OrderItem> getOrderItems(@PathVariable Integer orderId) {
		return orderItemRepository.findByOrderId(orderId);
	}
}

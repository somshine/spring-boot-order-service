package com.somshine.orderService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.somshine.orderService.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	List<OrderItem> findByOrderId(Integer orderId);
}

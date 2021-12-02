package com.somshine.orderService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.somshine.orderService.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	List<Order> findByCustomerId(Integer customerId);
	long countByCustomerId(Integer customerId);
}

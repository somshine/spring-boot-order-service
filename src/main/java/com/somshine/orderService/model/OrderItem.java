package com.somshine.orderService.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "shoppe_id")
	private Integer shoppeId;
	@Column(name = "order_id")
	private Integer orderId;
	@Column(name = "product_id")
	private Integer productId;
	@Column(name = "return_type_id")
	private Integer returnTypeId;
	@Column(name = "customer_id")
	private Integer customerId;
	@Column(name = "supplier_id")
	private Integer supplierId;
	@Column(name = "price_list_id")
	private Integer priceListId;
	@Column(name = "order_type_id")
	private Integer orderTypeId;
	private Double quantity;
	@Column(name = "comission_quantity")
	private Double comissionQuantity;
	private Double price;
	private Integer comission;
	private Double amount;
	@Column(name = "mrp_price")
	private Double mrpPrice;
	private Integer discount;
	@Column(name = "is_returned")
	private Integer isReturned;
	@Column(name = "created_on")
	private LocalDate createdOn;
	
	public OrderItem() {
		super();
	}

	public OrderItem(Long id, Integer shoppeId, Integer orderId, Integer productId, Integer returnTypeId,
			Integer customerId, Integer supplierId, Integer priceListId, Integer orderTypeId, Double quantity,
			Double comissionQuantity, Double price, Integer comission, Double amount, Double mrpPrice, Integer discount,
			Integer isReturned, LocalDate createdOn) {
		super();
		this.id = id;
		this.shoppeId = shoppeId;
		this.orderId = orderId;
		this.productId = productId;
		this.returnTypeId = returnTypeId;
		this.customerId = customerId;
		this.supplierId = supplierId;
		this.priceListId = priceListId;
		this.orderTypeId = orderTypeId;
		this.quantity = quantity;
		this.comissionQuantity = comissionQuantity;
		this.price = price;
		this.comission = comission;
		this.amount = amount;
		this.mrpPrice = mrpPrice;
		this.discount = discount;
		this.isReturned = isReturned;
		this.createdOn = createdOn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getShoppeId() {
		return shoppeId;
	}

	public void setShoppeId(Integer shoppeId) {
		this.shoppeId = shoppeId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getReturnTypeId() {
		return returnTypeId;
	}

	public void setReturnTypeId(Integer returnTypeId) {
		this.returnTypeId = returnTypeId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getPriceListId() {
		return priceListId;
	}

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}

	public Integer getOrderTypeId() {
		return orderTypeId;
	}

	public void setOrderTypeId(Integer orderTypeId) {
		this.orderTypeId = orderTypeId;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getComissionQuantity() {
		return comissionQuantity;
	}

	public void setComissionQuantity(Double comissionQuantity) {
		this.comissionQuantity = comissionQuantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getComission() {
		return comission;
	}

	public void setComission(Integer comission) {
		this.comission = comission;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getMrpPrice() {
		return mrpPrice;
	}

	public void setMrpPrice(Double mrpPrice) {
		this.mrpPrice = mrpPrice;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Integer getIsReturned() {
		return isReturned;
	}

	public void setIsReturned(Integer isReturned) {
		this.isReturned = isReturned;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", shoppeId=" + shoppeId + ", orderId=" + orderId + ", productId=" + productId
				+ ", returnTypeId=" + returnTypeId + ", customerId=" + customerId + ", supplierId=" + supplierId
				+ ", priceListId=" + priceListId + ", orderTypeId=" + orderTypeId + ", quantity=" + quantity
				+ ", comissionQuantity=" + comissionQuantity + ", price=" + price + ", comission=" + comission
				+ ", amount=" + amount + ", mrpPrice=" + mrpPrice + ", discount=" + discount + ", isReturned="
				+ isReturned + ", createdOn=" + createdOn + "]";
	}

}

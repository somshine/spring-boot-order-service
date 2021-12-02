package com.somshine.orderService.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "shoppe_id")
	private int shoppeId;
	@Column(name = "bill_no")
	private String billNo;
	@Column(name = "customer_id")
	private Integer customerId;
	@Column(name = "supplier_id")
	private Integer supplierId;
	@Column(name = "sale_quantity")
	private Double saleQuanity;
	@Column(name = "return_quantity")
	private Double returnQuantity;
	@Column(name = "sale_amount")
	private Double saleAmount;
	@Column(name = "return_amount")
	private Double returnAmount;
	@Column(name = "billing_amount")
	private Double billingAmount;
	private Integer discount;
	@Column(name = "paid_by_cash")
	private Double paidByCash;
	@Column(name = "created_on")
	private LocalDate createdOn;
	@Column(name = "updated_on")
	private LocalDate updatedOn;
	
	public Order() {
		super();
	}

	public Order(int shoppeId, String billNo, int customerId, int supplierId, Double saleQuanity,
			Double returnQuantity, Double saleAmount, Double returnAmount, Double billingAmount, int discount,
			Double paidByCash, LocalDate createdOn, LocalDate updatedOn) {
		super();
		this.shoppeId = shoppeId;
		this.billNo = billNo;
		this.customerId = customerId;
		this.supplierId = supplierId;
		this.saleQuanity = saleQuanity;
		this.returnQuantity = returnQuantity;
		this.saleAmount = saleAmount;
		this.returnAmount = returnAmount;
		this.billingAmount = billingAmount;
		this.discount = discount;
		this.paidByCash = paidByCash;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getShoppeId() {
		return shoppeId;
	}

	public void setShoppeId(int shoppeId) {
		this.shoppeId = shoppeId;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
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

	public Double getSaleQuanity() {
		return saleQuanity;
	}

	public void setSaleQuanity(Double saleQuanity) {
		this.saleQuanity = saleQuanity;
	}

	public Double getReturnQuantity() {
		return returnQuantity;
	}

	public void setReturnQuantity(Double returnQuantity) {
		this.returnQuantity = returnQuantity;
	}

	public Double getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(Double saleAmount) {
		this.saleAmount = saleAmount;
	}

	public Double getReturnAmount() {
		return returnAmount;
	}

	public void setReturnAmount(Double returnAmount) {
		this.returnAmount = returnAmount;
	}

	public Double getBillingAmount() {
		return billingAmount;
	}

	public void setBillingAmount(Double billingAmount) {
		this.billingAmount = billingAmount;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Double getPaidByCash() {
		return paidByCash;
	}

	public void setPaidByCash(Double paidByCash) {
		this.paidByCash = paidByCash;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", shoppeId=" + shoppeId + ", billNo=" + billNo + ", customerId=" + customerId + ", supplierId=" + supplierId + ", saleQuanity=" + saleQuanity
				+ ", returnQuantity=" + returnQuantity + ", saleAmount=" + saleAmount + ", returnAmount=" + returnAmount
				+ ", billingAmount=" + billingAmount + ", discount=" + discount + ", paidByCash=" + paidByCash
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}
}

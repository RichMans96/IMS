package com.qa.ims.persistence.domain;

public class Order {
	
	private Long orderId;
	private Long id;
	private Long itemId;
	private Integer qty;
	private Double totalCost;

	public Order(Long orderId, Long id, Long itemId, Integer qty, Double totalCost) {
		this.setOrderId(orderId);
		this.setCustomerId(id);
		this.setItemId(itemId);
		this.setQty(qty);
		this.setTotalCost(totalCost);
	}

	public Order(Long orderId, Integer qty, Double totalCost) {
		this.setOrderId(orderId);
		this.setQty(qty);
		this.setTotalCost(totalCost);
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	public Long getCustomerId() {
		return id;
	}

	public void setCustomerId(Long id) {
		this.id = id;
	}
	
	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Integer getQty() {
		return qty;
	}
	
	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public void setFirstName(Integer qty) {
		this.qty = qty;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "id:" + orderId + " Quantity" + qty + " Total Price:" + totalCost;
	}

	@Override
	public int hashCode() {

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

}

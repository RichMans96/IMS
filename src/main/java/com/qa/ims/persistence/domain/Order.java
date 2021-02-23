package com.qa.ims.persistence.domain;

public class Order {
	
	private Long orderId;
	private Long custId;
	private Long itemId;
	private Integer qty;
	private Double totalCost;
	private String itemName;
	private String custName;

	public Order(Long orderId, Long itemId, Integer qty, Double totalCost, String itemName, String custName) {
		this.setOrderId(orderId);
		this.setItemId(itemId);
		this.setQty(qty);
		this.setTotalCost(totalCost);
		this.setCustName(custName);
		this.setItemName(itemName);
	}

	
	public Order(Long custId, Long itemId, Integer qty) {
		this.setCustomerId(custId);
		this.setItemId(itemId);
		this.setQty(qty);
	}
	
	public Order(Long orderId, Long custId, Long itemId, Integer qty) {
		this.setOrderId(orderId);
		this.setCustomerId(custId);
		this.setItemId(itemId);
		this.setQty(qty);
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	public Long getCustomerId() {
		return custId;
	}

	public void setCustomerId(Long custId) {
		this.custId = custId;
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
	
	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "id: " + orderId + " first name: " + custName + " item: " + itemName + " Quantity: " + qty + " reaTotal Price: " + totalCost;
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

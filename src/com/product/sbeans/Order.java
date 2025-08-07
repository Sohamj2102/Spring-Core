package com.product.sbeans;

public class Order {
	private String orderId;
	private int quantity;
	private Product product; // (has-a Product)
	private Customer customer; // (has-a Customer)
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", quantity=" + quantity + ", product=" + product + ", customer="
				+ customer + "]";
	}
	

}

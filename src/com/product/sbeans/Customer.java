package com.product.sbeans;

public class Customer 
{
	private String customerName;
	private String contactNumber;
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", contactNumber=" + contactNumber + "]";
	}
	
	
}

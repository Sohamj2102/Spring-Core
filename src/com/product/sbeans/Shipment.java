package com.product.sbeans;

public class Shipment {
	private String shipmentId;
	private String address;
	private Order order;	// (has-a Order)
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Shipment [shipmentId=" + shipmentId + ", address=" + address + ", order=" + order + "]";
	}


}

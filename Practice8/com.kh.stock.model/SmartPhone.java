package com.kh.stock.model;

public class SmartPhone extends Device {
	
	private String os;
	
	public SmartPhone() {
	}

	public SmartPhone(String brand, String name, int price, String os) {
		super(brand, name, price);
		this.os = os;
	}

	@Override
	public String getinformation() {
//		return "[스마트폰] " + super.getinformation() + " | os: " + os;
		
		return String.format("[스마트폰] %s | os: %s"
				, super.getinformation(), this.os);
	}
	
	
	
}

package com.kh.stock.model;

public class Tablet extends Device {
	
	private boolean supportStylus;

	public Tablet() {

	}

	public Tablet(String brand, String name, int price, boolean supportStylus) {
		super(brand, name, price);
		this.supportStylus = supportStylus;
	}

	@Override
	public String getinformation() {
//		return "[태블릿] " + super.getinformation() + " | 펜 지원 여부: "
//				+ ((supportStylus == true) ? "지원함" : "지원 안함");
		
		return String.format("[태블릿] %s | 펜 지원 여부: %s"
				, super.getinformation()
				, supportStylus ? "지원함" : "지원 안 함");		
	}
	
	
	
	
}

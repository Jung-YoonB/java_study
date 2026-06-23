package com.kh.stock.model;

public class Device {
	
	protected String brand;
	protected String name;
	protected int price;
	
	public Device() {
		
	}
	
	public Device(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public String getinformation() {
//		return "브랜드: " + this.brand + ", 제품명: " + this.name 
//				+ ", 가격: " + this.price + "원";
		
		// printf 랑 유사한 메소드 기능 => String.format("문자열 형식", 사용할 값, ...)
		return String.format("브랜드: %s 제품명: %s, 가격: %d"
				, this.brand, this.name, this.price);
	}
}

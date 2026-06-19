package com.kh.ex1.model.vo;

public class Product {
	
	private String productName;
	private int price;
	private String brand;
	
	
	// 기본 생성자
	public Product() {
		
	}

	
	// 상품명 설정
	// getter = 해당 필드의 값을 반환하는 메소드
	public String getProductName() {
		return this.productName;
	}
	
	// setter = 해당 필드에 값을 저장하는 메소드
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	// 상품가 설정
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 상품 브랜드 설정
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// 인포 출력
	public void information() {
		System.out.printf("%s / %d / %s\n",	this.productName, this.price, this.brand);
	}
}

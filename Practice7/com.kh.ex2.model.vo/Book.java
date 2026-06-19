package com.kh.ex2.model.vo;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
		
	
	// 기본 생성자
	public Book() {
		
	}
	
	// 책 이름, 출판사, 저자명 생성자
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	// 책이름, 출판사, 저자명, 가격, 할인율 생성자
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	
	// Alt + Shift + S
	// => getter / setter > r 자동으로 세팅 할 수 있는(Generate) 단축키
	// => 이미 있는건 제외
	// 책 이름 설정
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	// 출판사 설정
	public String getPublisher() {
		return this.publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// 저자 설정
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 가격 설정
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 할인율 설정
	public double getDiscountRate() {
		return this.discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	// 인포 출력
	public void inform() {
		System.out.printf("도서명: %s 저자명: %s 출판사: %s 가격 : %d 할인율 : %.2f\n", this.title, this.author, this.publisher, this.price, this.discountRate);
	}
}

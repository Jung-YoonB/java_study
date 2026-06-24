package com.kh.ex2;

// 사각형 넓이 : 가로 x 세로
public class Rectangle implements Shape {
	private double width;
	private double hight;
	
	public Rectangle(double width, double hight) {
		super();
		this.width = width;
		this.hight = hight;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double hight) {
		this.hight = hight;
	}
	
	@Override
	public double calculateArea() {
		return this.width * this.hight;
	}	
	
}

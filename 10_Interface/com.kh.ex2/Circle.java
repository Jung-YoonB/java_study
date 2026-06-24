package com.kh.ex2;

// 원 넓이 : 파이 x 반지름 x 반지름
// Math.PI
public class Circle implements Shape {
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// 알트 + 쉬프트 + s => v
	@Override
	public double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}	
	
}

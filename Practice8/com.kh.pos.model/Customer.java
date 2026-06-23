package com.kh.pos.model;

public class Customer {
	
	private String name;
	private int age;
	private int points;
	
	public Customer() {
		
	}
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
		
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	//고객의 이름, 나이, 현재 보유 포인트를 포맷에 맞춰 문자열로 반환합니다.
	public String toString() {
		return String.format("고객 명: %s (%d 세)\n현재 보유 포인트: %d"
				, this.name, this.age, this.points);
	}
}

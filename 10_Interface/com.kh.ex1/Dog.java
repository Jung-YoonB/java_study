package com.kh.ex1;

public class Dog implements Animal, Baby {
	/*
 	void move();
 	void eat();
 	void makeSound();
	 */

	@Override
	public void move() {
		System.out.println("네 발로 걸어갑니다...");
	}
	
	@Override
	public void makeSound() {
		System.out.println("멍멍~");
	}
	
	@Override
	public void eat() {
		System.out.println("고기를 먹습니다..");
	}

	
}

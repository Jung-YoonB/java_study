package com.kh.ex2;

public class Quiz2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp = a;
		
		// 변수 값 교환 전
		System.out.printf("교환 전: a = %d, b = %d\n", a, b);
				
		a = b;
		b = temp;
		
		// 변수 값 교환 후
		System.out.printf("교환 후: a = %d, b = %d\n", a, b);
		
		
	}

}

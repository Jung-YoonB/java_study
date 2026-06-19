package com.kh.method;

public class Method2 {
	/*
	 * 	* 메소드 오버로딩
	 * 		: "하나의 클래스 내에서" " 같은 이름의 여러 개의 메소드가 존재할 수 있는 특징"
	 * 		: 조건) 매개 변수의 개수, 타입, 순서가 달라야 함!
	 * 			// 한 클래스에서 중복 된 이름의 메소드가 여러개 될 수 있음
	 * 			// - 매개 변수의 개수, 타입, 순서가 다를 때만 가능
	 */
	
	public static void main(String[] args) {
		
		int result1 = add(20, 7);
		System.out.println("20 + 7 = " + result1);
		
		double result2 = add(15.5, 8.8);
		System.out.println("15.5 + 8.8 = " + result2);
		
	}
	
	/**
	 * add 메소드
	 * : 두 정수의 합을 반환하는 메소드 
	 * 
	 * * 전달 받아야 하는 값 => O. 2개 전달 받아야 함!
	 * * 결과값 => O. 1개 => 기본 자료형으로 반환
	 */
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	/*
	 * public sttic double add(int n1, int n2) {}
	 * 
	 * 오버로딩이 적용 되지 않은 이유? 매개 변수 정보(개수, 타입, 위치)가 동일하기 때문에
	 * 매개 변수의 개수, 타입, 순서가 모두 동일한 메소드가 이미 존재했기 때문
	 */
	
	/**
	 * add 메소드
	 * 두 실수의 합을 반환하는 메소드
	 * @param n1 첫번째 실수형 데이터
	 * @param n2 두번째 실수형 데이터
	 * @return n1 + n2
	 */
	public static double add(double n1, double n2) {
		return n1 + n2;
	}

	
}

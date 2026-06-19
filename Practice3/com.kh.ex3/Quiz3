package com.kh.ex3;

import java.util.Scanner;
public class Quiz3 {

	public static void main(String[] args) {
		/*
		 “나이가 12세 미만이거나 키가 130cm 미만”인 경우 보호자가 반드시 동반
		 키보드로 탑승자의 나이(정수)와 키(실수)를 입력 받아
		 보호자 동반이 필요한 대상이면 "보호자 동반 필수",
		 혼자 탑승 가능하면 "단독 탑승 가능"을 출력하세요. 
		 (삼항 연산자 활용)
		 
		 // 입력 예시
		 	나이 : 10
		 	키 : 135.5
		 	
		 // 출력 예시
		 	나이 : 10
		 	키 : 135.5
		 	보호자 동반 필수
		 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		final int AGE_LIMIT = 12;
		final double HEIGHT_LIMIT = 130;
		
		String message = ( (age < AGE_LIMIT) || (height < HEIGHT_LIMIT) ) ? "보호자 동반 필수" : "단독 탑승 가능";
		
		System.out.println();
		
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println(message);
				
		sc.close();		
	}

}

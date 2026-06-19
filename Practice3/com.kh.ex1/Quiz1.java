package com.kh.ex1;

import java.util.Scanner;
public class Quiz1 {

	public static void main(String[] args) {

		/*
		 키보드로 정사각형의 한 변의 길이를 정수로 입력 받아, 
		 그 정사각형의 둘레의 길이와 넓이를 구하여 출력하세요.
		 
		 // 조건
		 	- 둘레 공식: 한 변의 길이 * 4
		 	- 넓이 공식 : 한 변의 길이 * 한 변의 길이
		 
		 // 입력 예시
		 	정사각형 한 변의 길이 : 5
		 
		 // 출력 예시
		 	정사각형 한 변의 길이 : 5
		 	둘레의 길이 : 20
		 	넓이 : 25
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정사각형 한 변의 길이 : ");
		int length = sc.nextInt();
		
		System.out.println();
		
		System.out.println("정사각형 한 변의 길이 : " + length);
		System.out.println("둘레의 길이 : " + (length * 4));
		System.out.println("넓이 : " + (length*length));
				
		sc.close();
		
	}

}

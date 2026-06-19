package com.kh.ex2;

import java.util.Scanner;

public class Quiz2 {
	
	public static void main(String[] args) {

		/*
		 * 입력 예시
		  		이름을 입력하세요: 이순신
		 		나이를 입력하세요: 25
		 	
		 *	출력 예시
		 		이순신님(25세)의 자바 학습을 환영합니다!
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		
		// String으로 다 받는거
		System.out.print("이름을 입력하세요: ");
		
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요: ");
		
		String age = sc.nextLine();
		
		System.out.printf("%s님(%s세)의 자바 학습을 환영합니다!\n", name, age);
		
		// * 한줄 띄움
		System.out.println();
		
		
		// 나이를 int로 받는거
		System.out.print("다음 이름을 입력하세요: ");
		
		String name2 = sc.nextLine();
		
		System.out.print("다음 나이를 입력하세요: ");
		
		int age2 = sc.nextInt();
		
		System.out.printf("%s님(%d세)의 자바 학습을 환영합니다!", name2, age2);
		
		
		sc.close();
		
	}
	
}

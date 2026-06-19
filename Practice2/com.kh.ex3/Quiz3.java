package com.kh.ex3;

import java.util.Scanner;
public class Quiz3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("소문자 입력: ");
		char small = sc.nextLine().charAt(0);
		// 특정 위치의 한 문자를 추출 : 문자열.charAt(위치);
		// * 위치 : 0부터 시작!
		
		// "happy" -> "happy".charAt(0) => 'h'
		//				 -> "happy".charAt(3) => 'p'
		//				 -> "happy".charAt(4) => 'y'
		
		// 소문자를 대문자로 변환
		char capital = (char)(small - 32);
		
		System.out.println();
		
		// println 사용
		System.out.println("소문자: " + small);
		System.out.println("대문자: " + capital);
		
		
		System.out.println();
		
		// printf 사용
		System.out.printf("소문자: %s\n", small);
		System.out.printf("대문자: %s", capital);
		
		
		sc.close();
		
	}

}

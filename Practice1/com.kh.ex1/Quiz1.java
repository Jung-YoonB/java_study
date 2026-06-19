package com.kh.ex1;

public class Quiz1 {

	public static void main(String[] args) {
		
		/*
		 * 출력 예시
		  		====================
		  		이름 : 홍길동
		  		나이 : 20세
		  		이메일: hong@gmail.com
		  		====================
		 */
		
		
		System.out.println("====================");
		System.out.println("이름 : 배정윤");
		System.out.println("나이 : 32세");
		System.out.println("이메일 : amazetong@naver.com");
		System.out.println("====================");
		
		System.out.println();
		System.out.println();
				
		/*
		 * 지시어 형식으로 이름, 나이 출력
		 * 문자열 --> %s
		 * 정수 --> %d
		 */
		System.out.println("====================");
		System.out.printf("이름 : %s\n", "배정윤");
		System.out.printf("나이 : %d세\n", 32);
		System.out.printf("이메일 : %s\n", "amazetong@naver.com");
		System.out.println("====================");

		
	}
	
}

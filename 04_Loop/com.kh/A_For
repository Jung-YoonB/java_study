package com.kh;

public class A_For {
/*
 * * 반복문 : 특정 코드를 반복적으로 수행하는 문법
 * 
 * * for 문
 * 	[표현법]
 * 		for (초기식; 조건식; 증감식) {
 * 			// 반복적으로 실행할 내용
 * 		}
 * 
 * * for 문 실행 순서
 * 		초기식 -> 조건식 검사 -> 결과가 true 인 경우 -> 실행할 내용 수행 -> 증감식 실행
 * 		 -> 조건식 검사 -> 결과가 true 인 경우 -> 실행할 내용 수행 -> 증감식 실행
 *			....
 *		 -> 조건식 검사 -> 결과가 false 인 경우 -> 반복문 종료 
 *
 *	* 참고 : 초기식, 조건식, 증감식은 생략 가능!
 *			=> 세미콜론(;)은 반드시 작성해야 함!!
 *		- 증감식 생략 => for (초기식; 조건식; ) {  }
 *		- 조건식 생략 => for (초기식; ; 증감식) {  }
 *		- 초기식 생략 => for ( ; 조건식; 증감식) {  }
 *		- 모두 생략 => for ( ; ; ) {  }
 */
	public static void main(String[] args) {
		
		// method1();
		// method2();
		// method3();
		// method4();
		method5();
		
	}

	public static void method1() {
		// "Hello" 를 5번 출력
		// 초기식 : int i = 0 
		// 증감식 : i++
		// 조건식 : i < 5
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " : Hello");
		}
		
		System.out.println();
		
		for (int i = 5; i > 0; i--) {
			System.out.println(i + " : Hello");
		}
	}
	
	public static void method2() {
		// 1부터 10까지 출력
		// 1 2 3 4 5 6 7 8 9 10
		
		// * 반복할 내용 => 출력한다!
		//	 출력하는 내용이 1씩 증가되고 있음!
		//	 시작값 : 1, 끝값 : 10
		
		// * 초기식 : int i =1
		// * 증감식 : i++
		// * 조건식 : i < 11, i <= 10
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();

		// 10부터 1까지 출력
		// * 초기식 : int i = 10
		// * 증감식 : i--
		// * 조건식 : i > 0, i >= 1
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	public static void method3() {
		// 1부터 10까지의 합
		
		// 1 + 2 + 3 + 4 + ... + 9 + 10
		
		// 별도의 합을 저장할 변수
		int total = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d + %d = %d\n", total, i, total + i);
			total += i;
		}
		
		System.out.println("1부터 10까지의 합 : " + total);
		
	}

	public static void method4() {
		// 1부터 랜덤값 까지의 총 합
		
		/*
		 * [랜덤값 구하는 방법]
		 * java.lang 에 있는건 improt 하지 않아도 됨 (예: String)
		 * - Math : java.lang.Math
		 * 		Math.randaom() 을 사용
		 * 			0.0 ~ 0.9999999 ( 0.0 <= 랜덤값 < 1.0 )
		 * 
		 * - ex) 1부터 10까지 랜덤값 추출
		 * 		Math.random() * 10 => 0.0 ~ 9. 999999..
		 * 		Math.random() * 10 + 1 => 1.0 ~ 10.99999..
		 * 
		 * 		(int)(Math.random() * 10 + 1) => 1 ~ 10
		 * 
		 */
		
		int random = (int)(Math.random() * 10 + 1);
		System.out.println("랜덤값 : " + random);
		
		System.out.println();
		// 1 부터 랜덤값까지의 합
		// * 초기식 : int i = 1
		// * 증감식 : i++
		// 		랜덤값 범위 -> 1 ~10
		// * 조건식 : 1 <= random
		//		1부터 10까지 합 -> i <= 10, i < 11
		//		1부터 랜덤값까지의 합 -> i <= 랜덤값, i < 램덤값+1
		int total = 0;
		
		for (int i = 1; i <= random; i++) {
			total += i;
		}
		
		System.out.println("1 부터 " + random + "까지의 합 : " + total);
		
	}

	public static void method5() {
		// 6단 출력
		/*
		 * 	6 * 1 = 6
		 * 	6 * 2 = 12
		 * 	6 * 3 = 18
		 *  6 * 4 = 24
		 *  ...
		 *  6 * 7 = 42
		 *  6 * 8 = 48
		 *  6 * 9 = 54
		 */
		// * 초기식 : int i = 1
		// * 조건식 : i <= 9, i < 10
		// * 증감식 : i++
		
		for (int i = 1; i < 10; i++) {
			int result = 6 * i;
			System.out.printf("6 x %d = %d\n", i, result);
		}
		// TODO: 구구단 : 2단 ~ 9단 모두 출력 프로그램 => 오늘 자정 전까지 이메일 제출!
		//		=> 중첩....!
		
		System.out.println();
		
		for (int dan = 2; dan < 10; dan++) {
			for (int i = 1; i < 10; i++) {
				int result = dan * i;
				System.out.printf("%d x %d = %d\n", dan, i, result);
			}
			System.out.println();
		}
		
		
	}
	
}

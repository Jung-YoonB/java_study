package com.kh;

import java.util.Scanner;

public class A_If {
	/*
	 * 기본적으로 프로그램은 순차적으로 실행 (위 -> 아래, 왼쪽 -> 오른쪽)
	 * 순차적인 흐름을 바꿀 때 "제어문"을 사용하여 처리 가능
	 * 
	 * * 조건문 if
	 * [1] 단독 if 문
	 *  if (조건식) {
	 *   // 조건식의 결과가 true일 때 실행할 내용
	 *  }
	 * 
	 * [2] if ~ else 문
	 *  if (조건식) {
	 *   // 조건식의 결과가 true일 때 실행할 내용
	 *  } else {
	 *   // 조건식의 결과가 false일 때 실행할 내용 
	 *  }
	 * 
	 * [3] if ~ else if ~ else 문
	 *  if (조건식1) {
	 *   // 조건식1의 결과가 true일 때 실행할 내용 
	 *  } else if (조건식2) {
	 *   // 조건식1의 결과가 false, 조건식2의 결과가 true일 때 실행할 내용 
	 *  } else {
	 *   // 조건식1, 조건식2의 결과가 모두 false일 때 실행할 내용 
	 *  }
	 * 
	 */

	public static void main(String[] args) {

		// method1();
		method2();

	}

	public static void method1() {
		// 입력받은 값이 1 ~ 10 사이의 값이면 해당 값을 출력
		// 그렇지 않으면 "범위를 벗어났습니다" 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("값 입력: ");
		int num = sc.nextInt();

		if (1 <= num && num <= 10) {
			System.out.println(num);
		} else {
			System.out.println("범위를 벗어났습니다.");
		}

		sc.close();

	}

	public static void method2() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 주민번호를 입력 받아 성별을 출력 ("남자", "여자")
		 * 단, -를 포함하여 입력받은 길이가 14자가 아닌 경우 "잘못 입력되었습니다"
		 * 출력
		 */

		System.out.print("주민번호 입력 (-포함) : ");
		String ssn = sc.nextLine(); // "000000-0000000"
		// 7번째 자리 문자 -> 성별 구분 가능!
		// "남자" : '1', '3', "여자": '2', '4'
		int lenght = ssn.length();
		final int MAX_LENGHT = 14;

		if (lenght == MAX_LENGHT) {

			char gender = ssn.charAt(7);
			// if lenght 체크 바깥에 작성하면 7번째 자리가 없는 값 받았을 때 오류남
			final char BOY1 = '1';
			final char BOY2 = '3';
			final char GIRL1 = '2';
			final char GIRL2 = '4';

			if (gender == BOY1 || gender == BOY2) {
				System.out.println("남자");
			} else if (gender == GIRL1 || gender == GIRL2) {
				System.out.println("여자");
			} else {
				System.out.println("외국인");
			}

			System.out.println();

			// switch 구문으로도 작성 해 보기
			switch (gender) {
			case BOY1:
			case BOY2:
				System.out.println("남자");
				break;

			case GIRL1:
			case GIRL2:
				System.out.println("여자");
				break;

			default:
				System.out.println("외국인");
				break;
			}

		} else {
			System.out.println("잘못 입력되었습니다.");
		}

		sc.close();
	}

}

package com.kh.ex2;

import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {
		/*
		 * 키보드로 입력받은 정수 값이 양수인지 먼저 확인한 뒤
		 * 양수일 경우 짝수와 홀수를 판별하고 양수가 아닐 경우 경고 문구를 출력
		 * [조건]
		 * 입력받은 정수 값이 양수(0보다 큰 수)일 때만 짝수/홀수를 판별
		 * 양수이면서 짝수인 경우 "짝수다"를 출력
		 * 양수이면서 홀수(짝수가 아닌 경우)인 경우 "홀수다"를 출력
		 * 력받은 정수가 양수가 아닌 경우(0 또는 음수) "양수만 입력해주세요"라고 출력
		 * 
		 * 입출력 예시 1
		 * 숫자를 한개 입력하세요 : -8
		 * 양수만 입력해주세요
		 * 
		 * 입출력 예시 2
		 * 숫자를 한개 입력하세요 : 8
		 * 짝수다
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num <= 0) {
			System.out.println("양수만 입력해주세요.");
		} else if (num % 2 == 0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다.");
		}
				
		sc.close();
	}

}

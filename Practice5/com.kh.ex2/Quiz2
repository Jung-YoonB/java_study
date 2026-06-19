package com.kh.ex2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 번 문제와 동일하게 정수를 입력 받아 역순으로 출력하되
		 * 사용자가 유효한 값(1 이상의 정수)을 입력할 때까지
		 * 계속해서 입력을 재 요청하는 프로그램을 작성
		 * 
		 * [조건] 
		 * 1 미만의 숫자가 입력되면 "1 이상의 숫자를 입력해주세요."를 출력하고
		 * 다시 사용자가 값을 입력하도록 반복 구조를 설계
		 * 사용자가 1 이상의 올바른 값을 입력하면
		 * 해당 숫자부터 1까지 공백으로 구분하여 출력한 뒤 프로그램을 종료
		 * 
		 * [입출력 예시]
		 * 1 이상의 숫자를 입력하세요 : 0
		 * 1 이상의 숫자를 입력해주세요.
		 * 1 이상의 숫자를 입력하세요 : -3
		 * 1 이상의 숫자를 입력해주세요.
		 * 1 이상의 숫자를 입력하세요 : 5
		 * 5 4 3 2 1
		 */
		
		int num;
		
		do {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		} while (num < 1);
	
		for (int i = num; i > 0; i--) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
	
}

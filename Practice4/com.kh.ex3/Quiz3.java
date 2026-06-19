package com.kh.ex3;

import java.util.Scanner;
public class Quiz3 {

	public static void main(String[] args) {
		/*
		 * 키보드로 점수를 입력받아 정해진 점수 범위에 따라 학점을 출력하는 프로그램을 작성
		 * 
		 * [조건]
		 * 올바른 점수 범위는 0 이상 100 이하입니다.
		 * 입력받은 점수가 범위를 벗어날 경우 "점수를 올바르게 입력해주세요."를 출력하고 프로그램을 종료
		 * 학점 분류 기준:
		 * - 90점 이상 : A
		 * - 80점 이상 : B
		 * - 70점 이상 : C
		 * - 70점 미만 : F
		 * 
		 * 입출력 예시 1
		 * 점수를 입력하세요(0-100): 80
		 * B
		 * 
		 * 입출력 예시 2
		 * 점수를 입력하세요(0-100): -10
		 * 점수를 올바르게 입력해주세요. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0-100): ");
		int score = sc.nextInt();
		
		if (0 <= score && score <= 100) {
			// 등급 부여
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else {
				System.out.println("F");
			}						
		} else {
			System.out.println("점수를 올바르게 입력해주세요.");
		}
		
		sc.close();
	}

}

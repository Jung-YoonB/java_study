package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 사용자로부터 5명의 학생의 수학 점수를 입력 받아 크기가 5인 정수형 배열에 저장한 뒤,
		 * 배열에 저장된 모든 점수의 총합과 평균을 계산하여 출력하는 프로그램을 작성
		 * 
		 * [조건]
		 * - 배열의 크기는 5로 고정합니다.
		 * - 총합은 정수로, 평균은 실수형으로 출력해야 합니다.
		 * 
		 * [입출력 예시]
		 * 1번 학생 점수 입력 : 80
		 * 2번 학생 점수 입력 : 95
		 * 3번 학생 점수 입력 : 90
		 * 4번 학생 점수 입력 : 75
		 * 5번 학생 점수 입력 : 85
		 * 
		 * 총합 : 425점
		 * 평균 : 85.0점
		 */
		
		int[] score = new int[5];
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "번 학생 점수 입력 : ");
			int result = sc.nextInt();
			score[i] = result;
			sum += score[i];
		}
		
		double avg = (double)sum/score.length;
		
		System.out.println();
		System.out.printf("총합 : %d점\n", sum);
		System.out.printf("평균 : %.1f점", avg);
		
				
		sc.close();
	}

}

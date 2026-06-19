package com.kh.ex4;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// 중첩 반복문 사용하여 행과 열의 구조를 설계
		// 입력 받은 정수 만큼의 행(줄)수가 출력
		// 각 행마다 행의 번호만큼 별의 개수가 늘어남

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int row = 0; row < num; row++) {
			for (int i = 0; i <= row; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}

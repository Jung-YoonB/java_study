package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 사용자로부터 한 개의 값을 입력 받아,
		 * 입력 받은 값부터 1까지 역순으로 출력하는 프로그램을 작성
		 * 
		 * [조건] 
		 * 입력 받은 정수는 1보다 크거나 같아야 합니다.
		 * 만약 1 미만의 정수가 입력되었을 경우,
		 * "1 이상의 숫자를 입력해주세요."라는 안내 문구를 출력
		 * 
		 * [입출력 예시 1]
		 * # 정상 입력인 경우
		 * 1 이상의 숫자를 입력하세요 : 4
		 * 4 3 2 1
		 * 
		 * 
		 * [입출력 예시 2]
		 * # 1 미만의 숫자를 입력한 경우
		 * 1 이상의 숫자를 입력하세요 : 0
		 * 1 이상의 숫자를 입력해주세요.
		 */

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

		sc.close();
	}

}

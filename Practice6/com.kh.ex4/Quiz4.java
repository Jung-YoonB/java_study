package com.kh.ex4;

import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {
		/*
		 * 길이가 10인 정수형 배열을 선언하고 1~100 사이의 랜덤값으로 배열을 초기화
		 * 배열에 저장된 값들 중 짝수와 홀수가 각각 몇 개인지 판별하여 출력하는 프로그램을 작성
		 * 
		 * [조건]
		 * Math.random()을 활용하여 1~100 사이의 난수를 생성
		 * 발생한 10개의 난수 배열의 전체 값을 먼저 한 줄로 출력한 후,
		 * 짝수와 홀수의 개수를 출력
		 * 
		 * [입출력 예시]
		 * 랜덤값으로 초기화 했으므로 출력 값은 매번 달라집니다.
		 * 생성된 배열 : [60, 31, 76, 52, 15, 56, 81, 21, 17, 72]
		 * 짝수의 개수 : 5
		 * 홀수의 개수 : 5
		 */
		

		int[] arr = new int[10];
		// 짝수, 홀수 나오면 카운팅해서 카운트 수 저장 할 변수 미리 만들어 두기
		int countEven = 0;
		int countOdd = 0;
		
		for (int i = 0; i < arr.length; i++) {
			// 랜덤값 받아와서 배열에 값 대입 해주기
			int random = (int)(Math.random()*100) + 1;
			arr[i] = random;
			
			// 대입한 값이 짝/홀 일 때마다 카운트 1씩 올려서 개수 세기
			if (arr[i] % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
			
		}
		
		System.out.println("생성된 배열 : " + Arrays.toString(arr));
		System.out.println("짝수의 개수 : " + countEven);
		System.out.println("홀수의 개수 : " + countOdd);
		
	}

}

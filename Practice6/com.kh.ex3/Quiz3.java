package com.kh.ex3;

import java.util.Arrays;

public class Quiz3 {

	public static void main(String[] args) {
		/*
		 * 크기가 10인 정수형 배열을 선언하고, 1~100 사이의 랜덤값으로 배열을 초기화
		 * 직접 정렬 알고리즘을 구현하여 배열을 오름차순으로 정렬하여 출력하는 프로그램을 작성
		 * 
		 * [조건]
		 * 자바에서 제공하는 정렬 메서드(Arrays.sort()) 사용을 금지
		 * 중첩 반복문과 Swap 로직을 활용하여 정렬을 직접 구현
		 * Swap 로직 : [종합 연습 문제 2] 중 2번 문제 참고!
		 * a = b / c = a /b = c 로 a, b 값 바꾸기
		 * 
		 * [힌트]
		 * 배열 내용을 한번 출력하고 싶을 경우 Arrays.toString(배열명) 을 사용
		 * 
		 * [입출력 예시]
		 * 랜덤값으로 초기화 했으므로 출력 값은 매번 달라집니다.
		 * 정렬 전: [38, 54, 43, 62, 78, 24, 19, 80, 26, 72]
		 * 정렬 후: [19, 24, 26, 38, 43, 54, 62, 72, 78, 80]
		 */
		

		int[] arr = new int[10];
		
		// arr 에 랜덤 값을 일단 넣자
		for (int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random()*100) + 1;
			arr[i] = random;		
		}
		
		// 내용 출력 => Arrays.toString(배열명) 사용할 경우 [ 값, 값, ...] 형태로 출력
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		// 정렬해야 하니까 일단 카피 하나 만들어 오기 (값 바꿔야 하니까 깊은 복사로)
		int[] copy = new int[10];
		System.arraycopy(arr, 0, copy, 0, arr.length);
		
		// 정렬해서 copy에 값을 넣자
		for (int i = 0; i < copy.length; i++) {
			// 일단 0 인덱스가 최소 값을 가지고 있다고 가정 하고 시작
			int minIndex = i;
			
			for (int j = i + 1; j < copy.length; j++) {
				// 그 다음 인덱스가 최소값을 가지고 있으면 인덱스 교체
				if(copy[j] < copy[minIndex]) {
					minIndex = j;
				}
						
			}
			
			// 값 넣기 전에 임시 보관함에 원래 값 임시 보관
			int c = copy[i];
			// 순차적으로 작은 값 넣어주기
			copy[i] = copy[minIndex];
			// 다음 작은 값 검사를 위해 원래 값 넣어주고 검사하러 가기
			copy[minIndex] = c;	
		}
		
		// 정렬 끝난 copy 출력하기
		System.out.println("정렬 후 : " + Arrays.toString(copy));
		
	}

}

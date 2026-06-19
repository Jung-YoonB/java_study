package com.kh.ex2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 미리 초기화된 과일 이름 배열이 있습니다.
		 * 사용자로부터 과일 이름을 입력 받아,
		 * 배열의 몇 번째 인덱스에 위치해 있는지 출력하는 프로그램을 작성
		 * 
		 * [조건]
		 * 과일 배열은 {"사과", "딸기", "바나나", "키위", "복숭아"} 로 초기화
		 * 배열에 없는 과일을 입력했을 경우, "찾는 과일이 없습니다."라는 안내 문구를 출력
		 * 
		 * [힌트]
		 * 문자열 (String) 의 경우 값을 비교하고자 할 때 문자열.equals(비교할값) 를 사용
		 * String name = "홍길동";
		 * boolean isEquals1 = name.equals("홍길동");    // isEquals1 = true;
		 * boolean isEquals2 = name.equals("김개똥");    // isEquals2 = false;
		 * 
		 * [입출력 예시]
		 * - 배열에 있는 과일을 입력한 경우
		 * 찾을 과일 이름을 입력하세요 : 바나나
		 * 바나나는 배열의 2번 인덱스에 있습니다.
		 * 
		 * - 배열에 없는 과일을 입력한 경우
		 * 찾을 과일 이름을 입력하세요 : 수박
		 * 찾는 과일이 없습니다. 
		 */
		
		String[] fruit = {"사과", "딸기", "바나나", "키위", "복숭아"};
		
		System.out.print("찾을 과일 이름을 입력하세요 : ");
		String setFruit = sc.nextLine();
		
		// 같은 과일 이름 찾았는지 체크
		boolean isFind = false;
		for (int i = 0; i < fruit.length; i++) {
			if ( setFruit.equals(fruit[i]) == true) {
				System.out.printf("%s는 배열의 %d번 인덱스에 있습니다.\n", setFruit, i);
				// 찾았으니까 값 바꿔줘
				isFind = true;
			}			
		}
		
		// 이전 단계에서 과일 찾았는지 못찾았는지 체크 : 찾았으면 실행 안함!
		if (isFind == false) {
			System.out.println("찾는 과일이 없습니다.");
		}
		
		sc.close();
	}

}

package com.kh.ex2;

import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {

		/*
		 키보드로 손님이 지불한 '돈(정수)'과 '물건 가격(정수)'을 각각 입력 받으세요.
		 거스름돈을 계산한 뒤, 거슬러 줄 1000원 짜리 지폐의 개수와 100원 짜리 동전의 개수를 구하여 출력
		 (단, 거스름돈은 항상 100원 단위로 떨어지며 500원 짜리 동전은 없다고 가정합니다.)
		 
		 // 입력 예시
		 	지불한 돈 : 10000
		 	물건 가격 : 6700
		 
		 // 출력 예시
		  	지불한 돈 : 10000
		  	물건 가격 : 6700
		  	--- 거스름돈 내역 ---
		  	천원 지폐 : 3장
		  	백원 동전 : 3개
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("지불한 돈 : ");
		int pay = sc.nextInt();
		
		System.out.print("물건 가격 : ");
		int price = sc.nextInt();
		
		// 거스름돈 계산
		int change = (pay > price) ? (pay - price) : 0;
		
		// 거스름돈 지폐, 동전으로 나누기
		int oneThouCount = change/1000;
		int oneHundCount = (change%1000)/100;
		
		System.out.println();
		
		System.out.println("지불한 돈 : " + pay);
		System.out.println("물건 가격 : " + price);
		System.out.println("--- 거스름돈 내역 ---");
		System.out.println("천원 지폐 : " + oneThouCount + "장");
		System.out.println("백원 동전 : " + oneHundCount + "개");
		
		sc.close();
		
	}

}

package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		/*
		 * 입력 예시
		  		상품명을 입력하세요: 아메리카노
		  		수량을 입력하세요: 3
		  		단가를 입력하세요: 4100.5
		 
		 * 출력 예시
				--- 장바구니 영수증 ---
				상품명    : 아메리카노
				수량      : 3 잔
				단가      : 4100.50 원
				----------------------
				총 금액   : 12301.50 원
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 1)"상품명을 입력하세요: " 출력
		System.out.print("상품명을 입력하세요: ");
		
		// 2) 상품명 입력받기
		String name = sc.next();
		
		// 3) "수량을 입력하세요: " 출력
		System.out.print("수량을 입력하세요: ");
		
		// 4) 수량 입력받기
		/*
			변수 명을 qty 로 하면 좀 더 짧! 간단!
				qty : Quantity(수량, 양, 분량)의 약자
				'물건의 총 개수'를 뜻할 때 주로 사용
		*/
		int count = sc.nextInt();
		
		// 5) "단가를 입력하세요:" 출력
		System.out.print("단가를 입력하세요: ");
		
		// 6) 단가 입력 받기
		Double price = sc.nextDouble();
		
		// * 한줄 띄움
		System.out.println();
		
		// 7) 결과 출력
		// 정렬 기능 사용 Ver
		System.out.println("--- 장바구니 영수증 ---");
		System.out.printf("%-7s: %s\n", "상품명", name);
		System.out.printf("%-8s: %d 잔\n", "수량", count);
		System.out.printf("%-8s: %.2f 원\n", "단가", price);
		System.out.println("----------------------");
		System.out.printf("%-7s: %.2f 원\n","총 금액", price * count);
		
		// * 두줄 띄움
		System.out.println();
		System.out.println();
		
		// 정렬 기능 안쓰고 그냥 출력 Ver
		System.out.println("--- 장바구니 영수증 ---");
		System.out.println("상품명    : " + name);
		System.out.printf("수량      : %d 잔\n", count);
		System.out.printf("단가      : %.2f 원\n", price);
		System.out.println("----------------------");
		System.out.printf("%-7s: %.2f 원","총 금액", price * count);
		
		
		sc.close();
	}
}

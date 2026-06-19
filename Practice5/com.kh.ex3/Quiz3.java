package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			
			int large = (num1 > num2) ? num1 : num2;
			int small = (num1 < num2) ? num1 : num2;
			
			for (int i = small; i <= large; i++) {
				System.out.print(i + " ");
			}
						
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
		sc.close();		
	}

}

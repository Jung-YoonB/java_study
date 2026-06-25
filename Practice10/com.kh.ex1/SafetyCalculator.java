package com.kh.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 사용자로부터 두 개의 정수를 입력받아 나눗셈 결과를 출력하는 프로그램을 작성
 * 잘못된 값(문자열 등)을 입력했을 때는 InputMismatchException
 * 두번째 숫자를 0 으로 입력했을 때는 ArithmeticException
 * 안전하게 예외 처리하여 프로그램이 강제 종료되지 않고 안내 메시지를 출력
 */
public class SafetyCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("=== 안전한 나눗셈 계산기 ===");
		
		try {
			System.out.printf("첫 번째 정수를 입력하세요: ");
			int n1 = sc.nextInt();
			System.out.printf("두 번째 정수를 입력하세요: ");
			int n2 = sc.nextInt();
			
			int result = n1 / n2;
			System.out.println("나눗셈 결과: " + result);
			
		} catch (InputMismatchException e) {
			System.out.println("[예외 발생] 숫자만 입력할 수 있습니다.");
	
		} catch (ArithmeticException e) {
			System.out.println("[예외 발생] 0으로 나눌 수 없습니다. 다시 시도해 주세요.");
		
		}
				
		System.out.println("프로그램이 안전하게 종료되었습니다.");
		
		
	}
}

package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		/*
		 * 아래 예시와 같이 메뉴판을 먼저 출력 메뉴 번호(1~4)를 누르면 "OO 메뉴입니다."를 출력
		 * (예: 3 입력 시 "조회 메뉴입니다.")
		 * 종료 번호(7)를 누르면 "프로그램이 종료됩니다."를 출력하고 프로그램을 종료
		 * 
		 * 입출력 예시 1 
		 * 1. 입력 
		 * 2. 수정 
		 * 3. 조회 
		 * 4. 삭제 
		 * 7. 종료
		 * 
		 * 메뉴 번호를 입력하세요 : 3 
		 * 조회 메뉴입니다.
		 * 
		 * 입출력 예시 2 
		 * 1. 입력 
		 * 2. 수정 
		 * 3. 조회 
		 * 4. 삭제 
		 * 7. 종료
		 * 
		 * 메뉴 번호를 입력하세요 : 7 
		 * 프로그램이 종료됩니다.
		 */
		Scanner sc = new Scanner(System.in);

		String menu1 = "1. ";
		String menu2 = "2. ";
		String menu3 = "3. ";
		String menu4 = "4. ";
		String menu7 = "7. ";

		String menuStr1 = "입력";
		String menuStr2 = "수정";
		String menuStr3 = "조회";
		String menuStr4 = "삭제";
		String menuStr7 = "종료";

		String message1 = " 메뉴입니다.";
		String message2 = "프로그램이 종료됩니다.";
		String message3 = "잘못 입력 되었습니다.";

		System.out.println(menu1 + menuStr1);
		System.out.println(menu2 + menuStr2);
		System.out.println(menu3 + menuStr3);
		System.out.println(menu4 + menuStr4);
		System.out.println(menu7 + menuStr7);
		System.out.println();

		System.out.print("메뉴 번호를 입력하세요 : ");
		int mNum = sc.nextInt();

		switch (mNum) {
		case 1:
			System.out.println(menuStr1 + message1);
			break;

		case 2:
			System.out.println(menuStr2 + message1);
			break;

		case 3:
			System.out.println(menuStr3 + message1);
			break;

		case 4:
			System.out.println(menuStr4 + message1);
			break;

		case 7:
			System.out.println(message2);
			break;

		default:
			System.out.println(message3);
			break;
		}

		System.out.println();
		// if 문으로도 작성해보기
		if (mNum == 1) {
			System.out.println(menuStr1 + message1);
		} else if (mNum == 2) {
			System.out.println(menuStr2 + message1);
		} else if (mNum == 3) {
			System.out.println(menuStr3 + message1);
		} else if (mNum == 4) {
			System.out.println(menuStr4 + message1);
		} else if (mNum == 7) {
			System.out.println(message2);
		} else {
			System.out.println(message3);
		}
				
		sc.close();
	}

}

package com.kh.ex1;

import java.time.LocalDate;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		/*
		 * 현재 연도는 `LocalDate.now().getYear()` 를 사용하여 동적으로 구하세요.
		 * 주민등록번호 뒷자리의 첫 번째 글자를 `chatAt()` 으로 추출합니다.
		 * `1` 또는 `2` 이면 1900년대 출생 (1: 남성, 2: 여성)
		 * `3` 또는 `4` 이면 2000년대 출생 (3: 남성, 4: 여성)
		 * 앞자리 2글자를 사용하여 출생 연도를 정확히 복원한 후 나이를 계산하세요.
		 * *나이 계산 공식: 현재 연도 - 출생 연도 + 1*
		 * (한국식 나이 기준 또는 만 나이 기준 중 편한 것으로 구현)
		 */
		
		Scanner sc = new Scanner(System.in);
		LocalDate ld = LocalDate.now();
		int ty = ld.getYear();
						
		System.out.print("주민번호 입력: ");
		String ssn = sc.nextLine();
		
		if (ssn.length() != 14) System.out.println("잘못 입력하였습니다.");
		
		String ssnYear = ssn.substring(0, 2);
		int birthYear = Integer.valueOf(ssnYear);
		int age = 0;
		
		char g = ssn.charAt(7);
//		char by1 = ssn.charAt(0);
//		char by2 = ssn.charAt(1);		
		
		String gender = "";
				
		switch (g) {
			case '1':
				gender = "남성";
				birthYear += 1900;
				break;
			case '2':
				gender = "여성";
				birthYear += 1900;
				break;
			case '3':
				gender = "남성";	
				birthYear += 2000;
				break;
			case '4':
				gender = "여성";
				birthYear += 2000;
				break;
			default:
				birthYear = 0;
				gender = "외국인";
		}
		
		age = ty - birthYear + 1;
		
        System.out.printf("%s 년생 출생 / 성별: %s / 나이: 만 %d세", birthYear, gender, age);
		
		sc.close();
	}	

}

package com.kh;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class F_DateTime {

	public static void main(String[] args) {
//		test1();
		test2();
		
	}
	
	// LocalDate, LocalTime
	public static void test1() {
		// 1) LocalDate : 날짜만 관리
		LocalDate today = LocalDate.now();
		System.out.println(today);	// 기본 포맷 : yyyy-MM-dd
		
		// * 특정일에 대한 데이터로 생성 : LocalDate.of(연도, 월, 일)
		LocalDate date1 = LocalDate.of(2026, 6, 11);
		System.out.println(date1);
		// => Date 와 달리, 연도와 월에 대해 별도의 계산이 필요 없음!!
		
		// 2) LocalTime : 시간만 관리
		LocalTime now = LocalTime.now();
		System.out.println(now);	// 기본 포맷 : hh:mm:ss.ssss
		
		// 3) DateTimeFormatter : 형식 지정 클래스
		String pattern = "yyyy년 MM월 dd일";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		
		// 날짜 객체.format(형식지정객체)
		System.out.println(today.format(formatter));
		System.out.println(date1.format(formatter));
		

		
	}
	
	// LocalDateTime
	public static void test2() {
		// LocalDateTime : 날짜와 시간 통합 관리
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);	// 기본 포맷 : yyyy-MM-ddThh:mm:ss.ssss
		
		// * 월 정보 반환 : getMonth(), getMonthValue()
		System.out.println(today.getMonth());		// 영문 월 반환
		System.out.println(today.getMonthValue());	// 숫자 월 반환
		
		// * 일 정보 반환 : getDayOfMonth(), getDayOfYear()
		System.out.println(today.getDayOfMonth());		// 한달 기준 며칠째인지
														// 한달 중 몇 번째 날인지 반환
		System.out.println(today.getDayOfYear());	// 일년 기준 며칠째인지
													// 일년 중 몇 번째 날인지 반환
		
		// 올해는 며칠이 남았는지?
		//	=> 윤년? today.toLocalDate().isLeapYear()
		int totalDays = today.toLocalDate().isLeapYear() ? 366 : 365;
		System.out.println("올해 남은 일수 ... " + (totalDays - today.getDayOfYear()));
		
		// * 시 정보 반환 : getHour()
		System.out.println(today.getHour());	// 24시간제로 계산(처리) 됨
		
		// * 퇴근 시간까지 얼마나 남았는지? 18시 - 현재시간
		int remindTime = 18 - today.getHour();
		if (remindTime > 0) System.out.println("퇴근까지 남은 시간 ... " + remindTime);
		else System.out.println("이미 퇴근 ~~~");
		
		// * 형식 지정 : DateTimeFormatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		System.out.println(today.format(formatter));
		
		/* 강의 복습 퀴즈 코드로 작성 해보기
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date2 = LocalDate.of(2026, 6, 11); 
		LocalDate date3 = LocalDate.of(2026, 12, 16); 
		
		System.out.println(date2.format(dtf));
		System.out.println(date3.format(dtf));
		System.out.println();
		LocalTime time2 = LocalTime.of(9, 0);
		LocalTime time3 = LocalTime.of(18, 0);

		System.out.println(date2.isBefore(date3));
		System.out.println(time2.isAfter(time3)); 
		*/
		
	}
}

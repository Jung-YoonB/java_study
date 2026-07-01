package com.kh.ex2.controller;

import java.time.Duration;
import java.time.LocalDateTime;

import com.kh.ex2.model.Customer;

public class StudyCafeController {
	private Customer[] customers;
	private int customerCount;
	
	public StudyCafeController() {
		super();
		customers = new Customer[100];
		customerCount = 0;
	}
	
	public int getCustomerCount() {
		return this.customerCount;
		
	}
	
	public String registerCustomer(String id) {
		/* 중복 가입 여부를 체크하고 새 회원 카드를 발급합니다
		 * 등록 시 오픈 기념 보너스 30분이 기본으로 지급됩니다.
		*/
		if (findCustomerById(id) != null) {			
			return "[오류] 이미 등록된 회원입니다.";
		}
		
		if (customerCount >= customers.length) {			
			return "[오류] 등록 정원을 초과했습니다. 가입할 수 없습니다.";
		}
		
		customers[customerCount++] = new Customer(id);	
		return "[안내] 신규 회원 등록이 완료되었습니다. (오픈 기념 보너스 30분 지급!)";
	}
	
	public String checkIn(String id) {
		/*
		 * 장부에서 해당 회원을 찾아 상태를 '입실 중'(`isCheckedIn = true`)으로 변경하고
		 * 퇴실 시 정산을 위해 현재 시각(`LocalDateTime.now()`)을 기록합니다.
		 * 단, 남은 잔여 시간이 0분인 회원은 입실할 수 없도록 차단합니다.
		 */
		// 고객목록(배열)에서 해당 고객번호를 찾기	
		Customer findCustomer = findCustomerById(id);
		
		if (findCustomer != null) {
			// * 등록 된 고객이 있는 경우 잔여시간 확인 (0분인 회원은 입실 차단)
			if (findCustomer.getRemainingTime() == 0) {
				return "[오류] 잔여시간이 없습니다. 충전 후 이용해주세요";
			}
			
			findCustomer.setCheckedIn(true);
			findCustomer.setCheckInTime(LocalDateTime.now());
			
			return "[안내] 입실 처리가 완료되었습니다.";
		} else {
			// 해당 고객이 없는 경우
			return "[오류] 등록되지 않은 회원입니다.";
		}		
	}
	
	public String checkOut(String id) {
		/*
		 * 퇴실 시점에 Duration.between() API를 활용해 
		 * [현재 퇴실 시간 - 저장된 입실 시간]을 연산하여 
		 * 실제 이용 시간(분 단위)을 계산하고 
		 * 회원의 잔여 시간에서 차감한 후 퇴실 상태로 전환합니다.
		 */		
		Customer findCustomer = findCustomerById(id);
		
		if (findCustomer == null) {
			return "[오류] 등록 된 고객 정보가 없습니다.";
		}
		
		if (!findCustomer.isCheckedIn()) {
			return "[오류] 체크인 하지 않은 고객입니다.";
		}
		
		// * 퇴실 처리 : 납은 시간 계산, checkedIn, checkInTime 업데이트
		LocalDateTime now = LocalDateTime.now();	// 현재 시간
		
		// Duration.between(체크인시간, 체크아웃 시간(현재))
		int minutes = (int)Duration.between(findCustomer.getCheckInTime(), now).toMinutes();
		
		int remainingTime = findCustomer.getRemainingTime() - minutes;
		
		if (remainingTime < 0) remainingTime = 0;
		// Math.max(값1, 값2) => Math.max(0, remainingTime);
		
		findCustomer.setRemainingTime(remainingTime);
		findCustomer.setCheckedIn(false);
		findCustomer.setCheckInTime(null);
		
		return String.format("[안내] 퇴실처리가 완료되었습니다. (퇴실 시간: %s)\n"
				+ "[정산] 이용 시간: %d분\n"
				+ "[정산] 남은 잔여 시간: %d분", now, minutes, remainingTime);
	}
	
	public String getCustomerInfo(String id) {
		Customer findCustomer = findCustomerById(id);
		
		if (findCustomer == null) {
			return "[오류] 등록되지 않은 회원입니다.";
		}
		
		String result = "[조회] 잔여 시간 : " + findCustomer.getRemainingTime() + "분\n";
		if (findCustomer.isCheckedIn()) {
			// 입실 상태
			result += "[조회] 상태: 입실 중 (입실 시각: " + findCustomer.getCheckInTime() + ")";
		} else {
			// 퇴실 상태
			result += "[조회] 상태: 퇴실(미입실) 상태";
		}
		
		return result;
	}
	
	private Customer findCustomerById(String id) {
		for (Customer c : customers) {
			if (c != null && c.getId().equals(id)) {
				return c;
			}			
		}
		return null;
	}
}

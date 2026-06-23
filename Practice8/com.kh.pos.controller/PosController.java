package com.kh.pos.controller;

import com.kh.pos.model.CardPayment;
import com.kh.pos.model.Customer;
import com.kh.pos.model.MobilePay;
import com.kh.pos.model.PaymentMethod;

public class PosController {
	
	private Customer customer;
	private PaymentMethod[] paymentList;
	
	
	// selectAllMethods(): PaymentMethod[]
	// POS 시스템 초기화 블록에서 => 기본 생성자안에서 생성된 전체 결제 수단 배열(paymentList)의 주소값을 반환
		public PosController() {		
		this.paymentList = new PaymentMethod[4];
		
		this.paymentList[0] = new MobilePay("네이버페이", 12, 1000000, "NAVER");
		this.paymentList[1] = new MobilePay("토스페이", 14, 2000000, "Toss");
		this.paymentList[2] = new CardPayment("국민 나라사랑카드", 12, 500000, true);
		this.paymentList[3] = new CardPayment("신한 체크카드", 8, 300000, false);
	}
	
	// View단에서 전달 받은 고객 객체 주소 값을 Controller의 customer 필드에 대입
	public void insertCustomer(Customer c) {
		this.customer = c;		
	}
	
	// getCustomerInfo(): Customer
	// 현재 등록된 고객 객체(customer)의 주소 값을 반환 (마이페이지용)
	public Customer getCustomerInfo() {
		return this.customer;
	}
	
	public PaymentMethod[] selectAllMethods() {
		return this.paymentList;
	}
	
	// searchMethod(keyword:String): PaymentMethod[]
	// 전달 받은 키워드가 결제 수단 명칭(name)에 포함(contains)되어 있는지 확인하고,
	// 검색된 객체들만 모은 새로운 배열을 동적으로 생성하여 반환
	public PaymentMethod[] searchMethod(String keyword) {
		// * 결제 수단 정보 -> paymentList 필드에서 관리 (PaymentMethod[])
		
		PaymentMethod[] result = new PaymentMethod[paymentList.length];
		int index = 0;
		
		for (PaymentMethod method : paymentList) {
			
			// method -> paymentList[인덱스] => PaymentMethod
			// method.name => 접근 불가!!
			String methodName = method.getName();
			
			// * 문자열.contains(키워드) : 문자열 내에 키워드가 포함되어 있으면 true,
			//						   그렇지 않으면 false
			// ex) "application".contains("cat") => true
			//	   "application".contains("c a t") => false
			
			if (methodName.contains(keyword)) {
				// == 결제명 내에 keyword가 포함된 경우
//				result[index] = method;
//				index++;
				result[index++] = method;
			}
		}
		
		return result;
		
	}		
	
	// processPayment(index:int): int
	// 전달 받은 인덱스의 결제 수단과 고객 정보를 비교 연산
	// - 기본 연령 미달 또는 모바일 페이 보안 기준 미달: 1 리턴
	// - 캐시백 카드 조건 충족 (고객 포인트 +500점 적립): 2 리턴
	// - 일반 결제 정상 승인: 0 리턴
	
	public int processPayment(int index) {
		PaymentMethod method = paymentList[index];
		
		// 1) 기본 연령 미달 또는 모바일 페이 보안 기준 미달 1 리턴
		//		+ 해당 결제 수단이 모바일 페이인 경우 나이가 제한연령+3세에 해당하는지?
		int customerAge = customer.getAge();
		int methodMinAge = method.getMinAge();
		
		// 모바일 페이 결제 수단인지 확인
		if (method instanceof MobilePay) {
			if (customerAge <= methodMinAge + 3) {
				return 1;
			}
		// 모바일이 아닐 때 나이 체크	
		} else {
			if (customerAge <= methodMinAge) {
				return 1;
			}
		}		
				
		// 결제 수단이 카드 결제인 경우, 캐시백 여부 확인				
		if (method instanceof CardPayment && ((CardPayment) method).isHasCashBack()) {
			// 결과 리턴 전에 고객 포인트 점수 +500
			int currPoint = customer.getPoints();
			customer.setPoints( currPoint + 500 );
			
			return 2;
		}
				
		return 0;
	}
	
}

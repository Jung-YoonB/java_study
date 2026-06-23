package com.kh.pos.model;

public class PaymentMethod {
	
	protected String name;
	protected int minAge;
	protected int transactionLimit;
	
	public PaymentMethod() {
		
	}
	
	public PaymentMethod(String name, int munAge, int transactionLimit) {
		this.name = name;
		this.minAge = munAge;
		this.transactionLimit = transactionLimit;
	}
	
	// * Controller 에서 name의 값을 확인하기 위해 메소드 추가
	public String getName() {
		return name;
	}	
	
	// * Controller 에서 minAge의 값을 확인하기 위해 메소드 추가
	public int getMinAge() {
		return minAge;
	}	
	
	
	// 플랫폼/카드명, 제한연령, 한도 정보를 문자열로 반환합니다. (자식 클래스에서 오버라이딩하여 사용)
	@Override
	public String toString() {
		return String.format("%s, 제한연령: %d세, 한도: %d원"
				, this.name, this.minAge, this.transactionLimit);
	}

	
}

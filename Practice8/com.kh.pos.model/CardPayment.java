package com.kh.pos.model;

public class CardPayment extends PaymentMethod {
	
	private boolean hasCashBack;

	public CardPayment() {
		
	}

	public CardPayment(String name, int minAge, int transactionLimit, boolean hasCashBack) {
		super(name, minAge, transactionLimit);
		this.hasCashBack = hasCashBack;
	}
	
	// * hasCashback getter 메소드 => Controller 작업 중 추가		
	public boolean isHasCashBack() {
		return hasCashBack;
	}

	@Override
	public String toString() {
		return String.format("신용/체크카드 - 카드명: %s | 캐시백 여부: %s"
				, super.toString()
				, hasCashBack ? "캐시백 가능" : "캐시백 없음");
	}
	
}

package com.kh.pos.model;

public class MobilePay extends PaymentMethod {
	
	private String payVendor;

	public MobilePay() {

	}
	
	// 컨트롤 + 쉬프트 + s => o 하고 위 드롭박스에서 부모 필드도 포함하는 내용으로 선택 변경
	public MobilePay(String name, int minAge, int transactionLimit, String payVendor) {
		super(name, minAge, transactionLimit);
		this.payVendor = payVendor;
	}

	@Override
	public String toString() {
		return String.format("모바일페이 - 플랫폼: %s | 제공사: %s"
				, super.toString(), this.payVendor);
	}
	
	
	
}

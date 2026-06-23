package com.kh.before;
/*	카드 결제 방식
com.kh.before.CreditCardPay
------------------------------------
- payName:String
- payAmount:int
- cardNumber:String
- installment:int
------------------------------------
+ CreditCardPay(payName:String, payAmount:int, cardNumber:String, installment:int)
+ getter / setter
+ processPay():void
 */

public class CreditCardPay {

	private String payName;
	private int payAmount;
	
	// 카드 결제 방식에서만 사용되는 데이터
	private String cardNumber;
	private int installment;
	
	
	public CreditCardPay() {
		
	}
	
	public CreditCardPay(String payName, int payAmount, String cardNumber, int installment) {
		this.payName = payName;
		this.payAmount = payAmount;
		this.cardNumber = cardNumber;
		this.installment = installment;
	}
	
	
	public String getPayName() {
		return payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	public int getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getInstallment() {
		return installment;
	}

	public void setInstallment(int installment) {
		this.installment = installment;
	}
	
	public void processPay() {
		System.out.println(" === 카드 결제 정보 === ");
		System.out.println("- 결제 내역 : " + this.payName);
		System.out.println("- 결제 금액 : " + this.payAmount);
		System.out.println("- 카드 번호 : " + this.cardNumber);
		System.out.println("- 할부 개월 수 : "
				+ (installment == 0 ? "일시불" : this.installment + "개월"));
		/*
	 	if (intallment == 0) {
	 		System.out.println("- 할부 개월 수 : 일시불");
	 	} else {
	 		System.out.println("- 할부 개월 수 : " + this.installment + "개월");
	 	}
		 */
		
	}
}


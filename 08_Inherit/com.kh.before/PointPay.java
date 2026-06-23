package com.kh.before;
/*
com.kh.before.PointPay
------------------------------------
- payName:String
- payAmount:int
- myPoint:int
------------------------------------
+ PointPay(payName:String, payAmount:int, myPoint:int)
+ getter / setter
+ processPay():void
*/

public class PointPay {
	
	private String payName;
	private int payAmount;
	
	// 포인트 결제 방식에서만 사용되는 데이터
	private int myPoint;
	
	
	public PointPay() {
		
	}
	
	public PointPay(String payName, int payAmount, int myPoint) {
		this.payName = payName;
		this.payAmount = payAmount;
		this.myPoint = myPoint;
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

	public int getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}
	
	public void processPay() {
		System.out.println(" === 포인트 결제 정보 === ");
		System.out.println("- 결제 내역 : " + this.payName);
		System.out.println("- 결제 금액 : " + this.payAmount);
		System.out.println("- 내 포인트 잔액 : " + this.myPoint);
		
		// 결제 금액 < 포인트 잔액 => "결제 성공"
		//			그렇지 않으면 => "결제 실패(잔액 부족)"
		System.out.println(
				(this.payAmount < this.myPoint) ? "결제 성공" : "결제 실패(잔액 부족)");
		
	}
}


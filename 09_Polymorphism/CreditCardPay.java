

// * 상석 관계 적용 : extends

public class CreditCardPay extends PaymentMethod {
	// 카드 결제 방식에서만 사용되는 데이터
	private String cardNumber;
	private int installment;
	
	public CreditCardPay() {
		
	}

	public CreditCardPay(String payName, int payAmount, String cardNumber, int installment) {
		// this.payName = payName; // PaymentMethod 클래서에서 private로 선언 된 필드이기 때문에 접근 불가!!
		// [1] setter 메소드를 사용하여 부모 클래스로부터 물려받은 필드에 대입(저장)
//		setPayName(payName);
//		setPayAmount(payAmount);		
		// [2] 부모 클래스의 생성자 사용(호출) **
		super(payName, payAmount);	// 생성자를 호출할 때는 항상 첫 줄에 작성!!
		this.cardNumber = cardNumber;
		this.installment = installment;
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
	
	@Override
	public void processPay() {
		System.out.println(" === 카드 결제 정보 === ");
//		System.out.println("- 결제 내역 : " + this.payName);
//		System.out.println("- 결제 금액 : " + this.payAmount);
		// => 상속 적용 후 출력
		System.out.println("- 결제 내역 : " + getPayName());
		System.out.println("- 결제 금액 : " + getPayAmount());
		System.out.println("- 카드 번호 : " + this.cardNumber);
		System.out.println("- 할부 개월 수 : "
				+ (installment == 0 ? "일시불" : this.installment + "개월"));
		/*
	 	if (installment == 0) {
	 		System.out.println("- 할부 개월 수 : 일시불");
	 	} else {
	 		System.out.println("- 할부 개월 수 : " + this.installment + "개월");
	 	}
		 */
		
	}
}

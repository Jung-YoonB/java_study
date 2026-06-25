package com.kh.ex2;

public class Run {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount(10000);
		
		System.out.println("=== 신한은행 출금 시스템 === ");

		try {
			ba.withdraw(4000);
			
		} catch (NotEnoughBalanceException e) {
			System.out.println(e.getMessage());
			System.out.println("부족한 잔액: " + e.getShortfallAmount() + "원");
		}
		
		System.out.println("=== 거래가 종료되었습니다 === ");

	}	

}

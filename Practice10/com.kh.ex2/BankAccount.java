package com.kh.ex2;

public class BankAccount {
	
	private int balance;

	// 현재 잔액
	public BankAccount(int initialBalance) {
		this.balance = initialBalance;
	}
	
	// 출금
	public void withdraw(int amount) throws NotEnoughBalanceException {
		System.out.printf("현재 잔액: %d원\n", this.balance);
		System.out.printf("출금 시도 잔액: %d원\n", amount);
		
		if (this.balance < amount) {
			throw new NotEnoughBalanceException("[출금 오류 발생] 잔액이 부족합니다.", this.balance, amount);
		}
		
		this.balance -= amount;
		System.out.printf("출금 완료! 남은 잔액: %d원\n", this.balance);
		
	}
	
}

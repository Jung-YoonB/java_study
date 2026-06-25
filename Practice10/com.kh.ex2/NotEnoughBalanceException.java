package com.kh.ex2;

public class NotEnoughBalanceException extends Exception {
	private int balance;
	private int withdrawalAmount;

	public NotEnoughBalanceException(String message, int balance, int withdrawalAmount) {
		super(message);
		this.balance = balance;
		this.withdrawalAmount = withdrawalAmount;
	}
	
	// 부족한 금액
	public int getShortfallAmount()	{
		return this.withdrawalAmount - this.balance;
	}
	
	// 현재 잔액
	public int getBalance() {
		return this.balance;
	}
	
}

package com.kh.ex2.model;

import java.time.LocalDateTime;

public class Customer {
	private String id;
	private int remainingTime;
	private boolean isCheckedIn;
	private LocalDateTime checkInTime;
	
	public Customer(String id) {
		super();
		this.id = id;
		
		// 오픈 보너스 (30분)
		this.remainingTime = 30;
		this.isCheckedIn = false;
		this.checkInTime = null;
	}

	public String getId() {
		return id;
	}
	public int getRemainingTime() {
		return remainingTime;
	}
	public void setRemainingTime(int remainingTime) {
		this.remainingTime = remainingTime;
	}
	public boolean isCheckedIn() {
		return isCheckedIn;
	}
	public void setCheckedIn(boolean isCheckedIn) {
		this.isCheckedIn = isCheckedIn;
	}
	public LocalDateTime getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(LocalDateTime checkInTime) {
		this.checkInTime = checkInTime;
	}

	@Override	// TODO:
	public String toString() {
		return "Customer [id=" + id + ", remainingTime=" + remainingTime + ", isCheckedIn=" + isCheckedIn
				+ ", checkInTime=" + checkInTime + "]";
	}	
	
}

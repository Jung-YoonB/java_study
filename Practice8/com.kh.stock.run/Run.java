package com.kh.stock.run;

import com.kh.stock.model.Device;
import com.kh.stock.model.SmartPhone;
import com.kh.stock.model.Tablet;

public class Run {

	public static void main(String[] args) {
		
		Device[] devi = {new SmartPhone("Apple", "iPhone 15", 1250000, "ios")
				, new SmartPhone("Samsung", "Galaxy S24", 1150000, "Android")
				, new Tablet("Samsung", "Galaxy tab 59", 980000, true)};
		
		
		System.out.println("=== 매장 보유 디바이스 재고 목록 ===");
		/*
		for (int i = 0; i < devi.length; i++) {
			System.out.println(devi[i].getinformation());		
		}
		*/
		// 항상 된 for 문 사용 가능 
		for (Device d : devi) {
			String info = d.getinformation();
			System.out.println(info);
		}
		
		System.out.println("====================================");
	}

}

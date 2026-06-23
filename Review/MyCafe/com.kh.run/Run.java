package com.kh.run;

import com.kh.menu.Americano;
import com.kh.menu.Drink;
import com.kh.menu.Latte;

public class Run {

	public static void main(String[] args) {
		
		Drink[] drink = new Drink[2];
		drink[0] = new Americano("아메리카노", 2000);
		drink[1] = new Latte("라떼", 3000);
		
		System.out.println("======= My Cafe =====================");

		for (int i = 0; i < drink.length; i++) {
			String menu = drink[i].getName();
			int price = drink[i].getPrice();
			
			System.out.printf("[%s] 가격: %d원\n", menu, price);
			drink[i].order();
			
			/* 각 자식 클래스별 단독으로 쓰는 필드(변수)가 없기 때문에 굳이 검사 안해도 됨!! 
			if (drink[i] instanceof Americano) {
				String menu = ((Americano)drink[i]).getName();
				int price = ((Americano)drink[i]).getPrice();
				
				System.out.printf("[%s] 가격: %d원\n", menu, price);
				((Americano)drink[i]).order();				
			} else if (drink[i] instanceof Latte) {
				String menu = ((Latte)drink[i]).getName();
				int price = ((Latte)drink[i]).getPrice();
				
				System.out.printf("[%s] 가격: %d원\n", menu, price);
				((Latte)drink[i]).order();						
			}	
			*/
		}
				
	}

}

package com.kh.ex1.run;

import com.kh.ex1.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		/*
		 * [조건]
		 * - `information()` 메소드 : 제품 정보를 출력합니다.
		 * - `Run` 클래스의 `main` 메소드에서 기본 생성자를 통해 2개의 `Product` 객체를 생성합니다.
		 * - 생성된 객체는 setter를 이용해 값을 대입한 후, 
		 *   `information()` 메소드를 호출하여 결과를 출력합니다.
		 *   
		 * 입출력 예시
		 * 아이폰16 / 1000000 / 애플
		 * 갤럭시 S25 / 1350000 / 삼성
		 */
		
		Product mac = new Product();
		Product ios = new Product();
		
		mac.setProductName("아이폰16");
		mac.setPrice(1000000);
		mac.setBrand("애플");
		
		ios.setProductName("갤럭시 S25");
		ios.setPrice(1350000);
		ios.setBrand("삼성");
		
		mac.information();
		ios.information();
		
	}

}

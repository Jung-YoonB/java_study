package com.kh.ex2.run;

// Ctrl + Shift + O => 자동 임포트
import com.kh.ex2.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		/*
		 * [조건]
		 * - `inform()` 메소드 : 도서 정보를 출력합니다.
		 * - `Run` 클래스의 `main` 메소드에서 3개의 생성자를 각각 사용하여
		 *    3개의 `Book` 객체를 생성합니다.
		 * - 부족한 정보는 setter를 이용하여 채워준 후,
		 *   `inform()` 메소드를 호출하여 결과를 출력합니다.
		 * 
		 * 입출력 예시
		 * 도서명: 객체지향의 사실과 오해 저자명: 조영호 출판사: 위키북스 가격 : 25000 할인율 : 0.1
		 * 도서명: 클린 코드 저자명: 로버트 C. 마틴 출판사: 인사이트 가격 : 38000 할인율 : 0.15
		 * 도서명: 실용주의 프로그래머 저자명: 앤드류 헌트, 데이비드 토마스 출판사: 인사이트 가격 : 35000 할인율 : 0.15
		 */
		
		Book b1 = new Book();
		Book b2 = new Book("클린 코드", "인사이트", "로버트 c. 마틴");
		Book b3 = new Book("실용주의 프로그래머", "인사이트", "앤드류 헌트, 데이비드 토마스", 35000, 0.15);
		
		
		b1.setTitle("객체지향의 사실과 오해");
		b1.setPublisher("위키북스");
		b1.setAuthor("조영호");
		b1.setPrice(25000);
		b1.setDiscountRate(1.0);
		
		b2.setPrice(38000);
		b2.setDiscountRate(0.15);
		
		
		System.out.printf("도서명: %s 저자명: %s 출판사: %s 가격 : %d 할인율 : %.1f\n", b1.getTitle(), b1.getAuthor(), b1.getPublisher(), b1.getPrice(), b1.getDiscountRate());
		b2.inform();
		b3.inform();
	}

}

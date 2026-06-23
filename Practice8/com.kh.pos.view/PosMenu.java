package com.kh.pos.view;

import java.util.Scanner;

import com.kh.pos.controller.PosController;
import com.kh.pos.model.Customer;
import com.kh.pos.model.PaymentMethod;

public class PosMenu {
	private PosController pc = new PosController();
	private Scanner sc = new Scanner(System.in);
	
		
	public void mainMenu() {
		
		System.out.println("--- 자가 쇼핑 POS 등록 ---");
		System.out.print("고객 이름 입력: ");
		String name = sc.nextLine();
		System.out.print("고객 나이 입력: ");
		int age = sc.nextInt();
		System.out.println("-------------------------");
		
		pc.insertCustomer( new Customer(name, age) );
		
		while(true) {
			System.out.println("==== 스마트 POS 단말기 메뉴 ====");
			System.out.println("1. 마이페이지 (멤버십 정보)");
			System.out.println("2. 전체 사용 가능 결제수단 조회");
			System.out.println("3. 결제수단 검색");
			System.out.println("4. 결제(구매)하기");
			System.out.println("9. 시스템 종료");					
			System.out.print("메뉴 번호: ");
			
			int menu = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기
			
			switch (menu) {
				case 1:
					// 마이페이지 -> 고객 정보 출력
					//	* 고객 정보는 Controller 의 getCustomerInfo 통해 반환
					Customer customer = pc.getCustomerInfo();
					
					System.out.println();
					System.out.println( customer/*.toString()*/ );
					System.out.println();					
					break;
				
				case 2:
					// 전체 결제 수단 조회
					printAllMethods();									
					break;
				
				case 3:
					// 결제 수단 검색
					searchMethod();
					break;
				
				case 4:
					// 결제하기					
					checkout();
					break;
				
				case 9:
					// 시스템 종료
					System.out.println();
					System.out.println("시스템을 종료합니다.");
					return; // 메소드 종료! -> 호출된 위치로 돌아간다!
					
				default:
					System.out.println();
					System.out.println("존재하지 않는 메뉴입니다.");
					System.out.println();
					break;
			}		
		}
	}
	
	public void printAllMethods() {
		System.out.println();
		
		PaymentMethod[] method = pc.selectAllMethods();
		
		for (int i = 0; i < method.length; i++) {
			System.out.printf("[%d번] %s\n", i, method[i]);						
		}
		
		System.out.println();
	}
	
	public void searchMethod() {
		
		System.out.println();
		System.out.print("검색할 결제 수단명 입력: ");
		String keyword = sc.nextLine();
		
		PaymentMethod[] result = pc.searchMethod(keyword);
		
		// 괜히 인덱스 번호 같이 출력하면 결제 할 때 헷갈리니까 항상 된 for 문으로
		 for (PaymentMethod method : result) {
		 	if (method != null) {
		 	System.out.println(method);
		 	}
		 }
		
		System.out.println();
	}
	
	public void checkout() {
		
		System.out.println();
		System.out.print("이용할 결제 수단 번호 선택: ");
		int payment = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기
		
		int checkout = pc.processPayment(payment);
		
		PaymentMethod[] ageCheck = pc.selectAllMethods();
		PaymentMethod selectPayment = ageCheck[payment];
		
		if (checkout == 0) {
			System.out.println(">> [결과] 결제 성공");
		} else if (checkout == 1) {
			System.out.printf(">> [결과] 제한연령 미달이거나, 모바일 페이 추가 보안 가이드(%d세) 기준 미달로 승인이 거절되었습니다.\n", selectPayment.getMinAge() + 3);
		} else {
			System.out.println(">> [결과] 결제 성공, 캐시백 제휴 카드로 확인되어 멤버십 포인트 500점이 특별 적립되었습니다.");
		}
		System.out.println();
		
	}
	
}

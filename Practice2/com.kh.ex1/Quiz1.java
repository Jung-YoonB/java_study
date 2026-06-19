package com.kh.ex1;

import java.util.Scanner;
public class Quiz1 {

	public static void main(String[] args) {

		/*
		 **입력 예시**
			이름: 이순신
			나이: 25
			키: 176.5
		
		**출력 예시**
			====================
			이름: 이순신
			나이: 25세
			키: 176.5cm
			====================
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.print("키: ");
		double height = sc.nextDouble();
		
		System.out.println();
		
		// println 으로 출력
		System.out.println("====================");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.println("키: " + height + "cm");
		System.out.println("====================");
		
		System.out.println();
		
		//printf 로 출력
		System.out.println("====================");
		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d세\n", age);
		System.out.printf("키: %.1fcm\n", height);
		System.out.println("====================");
	
		sc.close();
		
	}

}

package com.kh.access.run;

import com.kh.access.AccessTest;

public class Run {

	public static void main(String[] args) {
		// AccessTest 객체 생성
		AccessTest test = new AccessTest();
		
		System.out.println( test.publicField );
		test.publicMethod();
		// => public 멤버 접근 가능!!
		
		// protected, default, private 접근 불가!
		// = 패키지 경로가 다르기 때문!!
//		System.out.println( test.protecedField );
//		test.protectedMethod();
		
//		String str = test.defaultField;
//		test.defaultMethod();
		
//		String str2 = test.privateField;
//		test.privateMethod();
		
	}

}

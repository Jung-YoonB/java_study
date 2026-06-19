package com.kh;

public class A_Arithmetic {
	/*
	 * 산술 연산자 (이항 연산자) => (+) (-) (*) (/) (%)
	 * 
	 * 우선 순위 : (*) (/) (%) > (+) (-)
	 */
	
	public static void main(String[] args) {

		//	method1();
		method2();
		
	}

	public static void method1() {
		// 10, 3 값을 각각 n1, n2 변수에 저장
		int n1 = 10;
		int n2 = 3;
		
		// n1, n2의 합, 차, 곱, 몫, 나머지 출력
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));
		System.out.println("n1 * n2 = " + (n1 * n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 % n2 = " + (n1 % n2));
		
	}
	
	public static void method2() {
		int a = 5;
		int b = 10;
		
		int c = ++a + b; // => 6 + 10 = 16 // a = 6, c = 16
		int d = c / a; // => 16 / 6 = 2 // d = 2
		int e = c % a; // => 16 / 6 의 나머지 = 4 // e = 4
		int f = e++; // => 4 먼저 출력 후 e에 5 증가 // f = 4, e = 5
		int g = --b + d--; // => 9 + 2 = 11 먼저 대입 후 d에 1 감소 // g = 11, b = 9, d = 1 
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		// 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2) // c = 15, e = 6
		// = 6 + 9 / (3) * (10) % (8) = 6 + 30 % 8 = 6 + 6 = 12 // i = 12, a = 7, g = 10
		
		// => d, e, f, g, h, i
		// 최종 a = 7, b = 9, c = 15, d = 1, e = 6, f = 4, g = 10, h = 2, i = 12
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
	}
	
}

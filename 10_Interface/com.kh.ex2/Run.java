package com.kh.ex2;

public class Run {

	public static void main(String[] args) {
		// 크기가 2인 배열 생성 [ 원(반지름 5), 사각형(가로: 3, 세로: 4) ]
		Shape[] sArr = {new Circle(5), new Rectangle(3, 4)};
				
		/*
		 	원의 넓이 : 0000
		 	사각형의 넓이 : 0000
		 */
		
		for (Shape s : sArr) {			
			if (s instanceof Circle) {
				System.out.printf("원의 넓이 : %.2f\n", s.calculateArea());
			} else if (s instanceof Rectangle) {
				System.out.printf("사각형의 넓이 : %.2f\n", s.calculateArea());
			}
		}
		
	}

}

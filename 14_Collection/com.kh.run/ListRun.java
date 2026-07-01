package com.kh.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.model.sort.Student;

public class ListRun {
	// List : 순서가 있고, 중복 허용
	
	public static void main(String[] args) {
		
		// 선언 및 생성
		List<Student> list = new ArrayList<>();
		
		// 데이터 추가 (학생)
		list.add(new Student("배정윤", 20, 77.7));
		list.add(new Student("최재욱", 21, 87.7));
		list.add(new Student("이고은", 22, 97.7));
		
		// 저장 된 데이터 크기 확인
		System.out.println("현재 저장 된 학생 수 : " + list.size());
		
		// 학생 정보 출력
		for (int i = 0; i<list.size(); i++) System.out.println(list.get(i));
		
		// 첫번째 학생 정보 제거
		list.remove(0);
		System.out.println("현재 저장 된 학생 수 : " + list.size());
				
		for (Student s : list) System.out.println(s);
		
		System.out.println("------ 점수 내림차순으로 정렬 ------");
		// 데이터 정렬
		Collections.sort(list);
		
		for (Student s : list) System.out.println(s);
		
	}

}

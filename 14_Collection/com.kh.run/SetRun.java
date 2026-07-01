package com.kh.run;

import java.util.HashSet;
import java.util.Set;

import com.kh.model.set.Student;

public class SetRun {
	// Set : 순서가 없고, 중복이 허용되지 않음
	public static void main(String[] args) {
		// 선언 및 생성
		Set<Student> set = new HashSet<>();
		
		// 데이터 추가
		set.add(new Student("배정윤", 20, 78.9));
		set.add(new Student("김예원", 20, 87.7));
		set.add(new Student("최재욱", 20, 99.9));
		
		set.add(new Student("배정윤", 20, 78.9));
		
		System.out.println("저장된 학생 수 : " + set.size());
		for (Student s : set) System.out.println(s); 
	}

}

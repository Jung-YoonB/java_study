package com.kh.run;

import java.util.HashMap;
import java.util.Map;

import com.kh.model.Student;

public class MapRun {
	// Map : Key-value 구조로 데이터 관리
	//		 - key 값은 중복 x, value 값 중복 가능
	
	public static void main(String[] args) {
		// 선언 및 생성
		Map<String, Student> map = new HashMap<>();
		
		// 데이터 추가 : put(키값, 밸류값)
		map.put("배정윤", new Student("배정윤", 20, 88.9));
		map.put("임광희", new Student("임광희", 20, 92.5));
		map.put("김채희", new Student("김채희", 20, 96.2));
		
		// 데이터 조회 : get(키값) : 밸류값
		Student s = map.get("김채희");
		// 조회 성공 시 데이터 출력, 실패 시 "해당 데이터가 없습니다."
		if (s != null) System.out.println(s);
		else System.out.println("해당 데이터가 없습니다.");
		
		// * entrySet 사용하여 조회 => 전체 순회
		for (Map.Entry<String, Student> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() 
							+ " value: " + entry.getValue());
		}
		
	}

}

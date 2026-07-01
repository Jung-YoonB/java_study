package com.kh.model.sort;

// 컬렉션 정렬을 적용하기 위해 Comparable 인터페이스 구현(상속)
public class Student implements Comparable<Student> {
	
	private String name;
	private int age;
	private double score;
	
	
	public Student() {
		
	}
	
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	// 알트 + 쉬프트 + s => o : 생성자 생성
	/*
	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	// 점수 기준으로 정렬 (내림차순)
	@Override
	public int compareTo(Student o) {
	
		return Double.compare(o.score, this.score);
	}	
	
	
}

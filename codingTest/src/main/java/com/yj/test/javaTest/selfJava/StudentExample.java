package com.yj.test.javaTest.selfJava;

public class StudentExample {

	public static void main(String[] args) {
		
		// s1과 s2는 비록 같은 클래스로부터 생성되었지만 객체는 자신만의 고유 데이터를 가지면서 메모리 활등을 하게 된다.
		// 따라서 s1과 s2가 참조하는 Student 객체는 완전히 독립된 서로 다른 객체이다.
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조한다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조한다.");
	}

}

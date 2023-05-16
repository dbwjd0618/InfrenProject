package com.yj.test.javaTest.posting;

public class InstanceTest {
	
	int a; //a: 기본형, 전역 - 인스턴스변수
	static String b; //b: 참조형, 전역 - 스태틱변수
	void m(int c) { //c: 기본형, 매개변수이면서 지역변수
		int d = c; //d: 기본형, 지역변수
	}
	
	public static void main(String[] args) { //args: 참조형, 매개변수이면서 지역변수
		
		int e = 0; //기본형, 지역변수
		InstanceTest i = new InstanceTest(); //참조형, 지역변수
		i.m(e); //e: 인자값으로, 값 0이 매개변수에 복사되어 넣어진다.
	}

}

package com.yj.test.javaTest.book;

public class Test1 {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		t1.test();
	}

	public void test() {

		int i;
	//	System.out.println(i); 
	//	The local variable i may not have been initialized
	//	변수 i를 초기화 하지 않고 i를 사용하려고 할때 발생하는 에러
		i = 10;
		System.out.println(i);

		double d = 20.0;
	}

}


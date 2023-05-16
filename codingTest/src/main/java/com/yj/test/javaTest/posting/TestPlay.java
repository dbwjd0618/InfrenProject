package com.yj.test.javaTest.posting;

public class TestPlay {

	public static void main(String[] args) {
		
		int a = 1;
		TestPlay t = new TestPlay();
		t.test(a);
		System.out.println("1 = "+a);
		System.out.println("2 = "+a);

	}
	
	public void test(int b) {
		System.out.println("3 = "+b);
		b = 433;
		System.out.println("4 = "+b);
	}

}

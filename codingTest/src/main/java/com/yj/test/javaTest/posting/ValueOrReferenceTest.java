package com.yj.test.javaTest.posting;

import java.util.Arrays;

public class ValueOrReferenceTest {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int b = 9;

		ValueOrReferenceTest t = new ValueOrReferenceTest();
		t.callByTest(a);// void메소드
		System.out.println(Arrays.toString(a));// [100, 200, 300, 400, 500]

		t.callByTest(b);
		System.out.println(t.callByTest(b));// 9

		// 문자열계열 테스트
		// String은 callByValue로 처리됨.
		// StringBuilder는 callByReference로 처리됨.
		String s = "오오오";
		String s1 = "안녕";
		String s2 = new String("Hello");
		StringBuilder sb = new StringBuilder("니하오");
		t.strTest(s1);
		System.out.println(s1);// 안녕
		
		t.strTest(s);
		System.out.println(s);

		t.strTest(s2);
		System.out.println(s2);// Hello

		t.strTest(sb);
		System.out.println(sb);// 니하오짜이찌엔
	}

	private void test() {

	}

	private int callByTest(int b) {
		b = 99;
		return b;
	}

	private void callByTest(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] *= 100;
		}
	}

	private void strTest(String s) {
		s = "으웩";
	}

	private void strTest(StringBuilder s) {
		s.append("짜이찌엔");
	}

}

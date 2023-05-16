package com.yj.test.javaTest.selfJava;

import java.io.IOException;

public class VariableType {

	public static void main(String[] args) {
		try {
			continueKeyCodeReadExample();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		try {
//			keyCodeExample();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		printfExample();
//		castingExample();
//		promotionExample();
//		booleanExample();
//		floatDoubleExample();
//		escapeExampl();
//		charExampl();
//		longExample();
//		byteExample();
//		integerLiteralExample();
	}

	private static void continueKeyCodeReadExample() throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			
			if(keyCode == 113) break;
		}
		System.out.println("시스템 종료");
	}

	private static void keyCodeExample() throws Exception {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode : "+ keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : "+ keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : "+ keyCode);
		
	}

	private static void printfExample() {
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value);
		System.out.printf("상품의 가격 : %6d원\n", value);
		System.out.printf("상품의 가격 : %-6d원\n", value);
		System.out.printf("상품의 가격 : %06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%-10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

	private static void castingExample() {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
		char c1 = 'a';
		char c2 = (char) (c1 + 1);
		System.out.println(c2);
	}

	private static void promotionExample() {
		// 자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}

	private static void booleanExample() {
		boolean stop = true;
		if(stop) System.out.println("중지합니다.");
		else System.out.println("시작합니다.");
		
		// 허용범위를 벗어나서 발생하는 에러
		// The literal 2e-350 of type double is out of range
//		double value = 2e-350;
//		System.out.println(value);
	}

	private static void floatDoubleExample() {
		// 실수값의 기본형은 Double 이다. float을 사용하고 싶으면 값 뒤에 f를 붙일 것
		// Type mismatch: cannot convert from double to float
		// float var1 = 3.14;
		// System.out.println(var1);
		double var2 = 3.14f;
		double var3 = 3.14;
		System.out.println(var2);
		System.out.println(var3);
	}

	private static void escapeExampl() {
		System.out.println("번호\t이름\t직업");			// tab만큼 띄움
		System.out.println("행 단위 출력\n");			// 개행
		System.out.println("우리는 \"개발자\" 입니다.");	// 큰따옴표 출력
		System.out.println("봄\\여름\\가을\\겨울");		// \ 출력
	}


	private static void charExampl() {
		char c1 = 'A';		// 문자를 직접 저장
		char c2 = 65;		// 10진수로 저장
		char c3 = '\u0041'; // 16진수로 저장
		char c4 = '가';		// 문자를 직접 저장
		char c5 = 44032;	// 10진수로 저장
		char c6 = '\uac00';	// 16진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}

	private static void longExample() {
		long var1 = 10;
		long var2 = 20;
		// long 타입 허용범위 : -2,147,483,648 ~ 2,147,483,647
		// The literal 30000000000 of type int is out of range
		// long var3 = 30000000000;
		long var4 = 30000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
		System.out.println(var4);
	}

	private static void byteExample() {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// 128부터 byte로 선언했을 때 발생하는 에러
		// Type mismatch: cannot convert from int to byte
		// byte var6 = 128;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
//		System.out.println(var6);
	}


	// 정수 리터럴
	private static void integerLiteralExample() {
//		int var1 = 0b1011;
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0xB3;
		
//		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
	}

}

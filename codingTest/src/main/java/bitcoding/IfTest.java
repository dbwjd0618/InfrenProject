package bitcoding;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
//		ifTest1();
//		ifTest2();
		itTest3();

	}

	// 1. 숫자 하나를 입력받아 해당 숫자가 홀수면 oddNumber를 짝수면 evenNumber를 출력하여라
	public static void ifTest1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println("evenNumber");
		}
		
		if(number%2 == 1) {
			System.out.println("oddNumber");
		}
	}
	
	//2. 주민번호 앞자리를 입력받아 65세 이상이면 old가 출력되도록 하여라
	public static void ifTest2() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("숫자를 입력하세요");
		 int i = sc.nextInt();
		 
		 if(i <= 1000) {
			 // 2진법 처리
			 String binaryString = Integer.toBinaryString(i);
			 // string으로 받아서 8진법 처리
			 int eight = Integer.parseInt(binaryString, 8);
			 System.out.println("2진법 = " + binaryString + " / 8진법 = " + eight);
		 }
		 else {
			 // 8진법 처리
			 String octalString = Integer.toOctalString(i);
			 // string으로 받아서 16진법 처리
			 int sixteen = Integer.parseInt(octalString, 16);
			 System.out.println("8진법 = " + octalString + " / 16진법 = " + sixteen);
			 
		 }
	}
	
	//3. 숫자 두개를 입력받아 두 수의 차이를 구하라.
	public static void itTest3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1을 입력하세요");
		int a = sc.nextInt();
		System.out.println("숫자2를 입력하세요");
		int b = sc.nextInt();
		
		int result = (a > b) ? a : b;
		if(result == a) {
			System.out.println("a에서 b를 뺀 수 : " + (a-b));
		}
		else {
			System.out.println("b에서 a를 뺀 수 : " + (b-a));
		}
		
	}
}

package com.yj.test.javaTest.selfJava;

public class IfTest {

	public static void main(String[] args) {
		IfTest it = new IfTest();
		it.ifDiceExample();
	}

	public void ifDiceExample()	{
		int iValue = (int) (Math.random() * 6) + 1;
		switch (iValue) {
		case 1:
			System.out.println("주사위 숫자는  "+iValue+" 입니다.");
			break;
		case 2:
			System.out.println("주사위 숫자는  "+iValue+" 입니다.");
			break;
		case 3:
			System.out.println("주사위 숫자는  "+iValue+" 입니다.");
			break;
		case 4:
			System.out.println("주사위 숫자는  "+iValue+" 입니다.");
			break;
		case 5:
			System.out.println("주사위 숫자는  "+iValue+" 입니다.");
			break;
		case 6:
			System.out.println("주사위 숫자는  "+iValue+" 입니다.");
			break;

		default:System.out.println("오류");
			break;
		}
	}
	
}

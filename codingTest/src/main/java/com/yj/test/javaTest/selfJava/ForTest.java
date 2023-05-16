package com.yj.test.javaTest.selfJava;


public class ForTest {

	public static void main(String[] args) {
		forIconDraw();
//		forBangJeongSic();
//		whileFinalExample();
//		forFinalExample();
//		continueExample();
//		forBreakExample();
//		whileBreakExample();
//		whileSumExample();
//		forFloatExample();
//		forSumExample();
	}
	
	private static void forIconDraw() {
//		for(int i = 1; i < 5; i ++) {
//			for (int j = 1; j <= i; j++ ) {
//				System.out.print("*");
//				if (j == i) {
//					System.out.println();
//				}
//			}
//		}
		for(int i = 1; i < 5; i ++) {
			for (int j = 4; j > 0; j-- ) {
				if(i < j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}

	private static void forBangJeongSic() {
		for(int x = 1; x <= 10; x ++) {
			for(int y = 1; y <= 10; y ++) {
				int result = x*4 + y*5;
				if(result == 60) {
					System.out.println("x : "+x+", y : "+y);
				}
			}
		}
	}

	private static void whileFinalExample() {
		
		while(true) {
			int i = (int) (Math.random() * 6) + 1;
			int j = (int) (Math.random() * 6) + 1;
			System.out.println("("+i+", "+j+")");
			if(i+j != 5) {
				continue;
			}
			if(i+j == 5) {
				System.out.println("("+i+", "+j+")");
				break;
			}
		}
		System.out.println("종료");
	}

	private static void forFinalExample() {
		int sum = 0;
		for(int i = 1; i <= 100; i ++) {
			if(i%3 == 0) 
			sum += i;
		}
		System.out.println(sum);
	}

	private static void continueExample() {
		for(int i = 1; i <= 10; i ++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	private static void forBreakExample() {
		
		Outter:for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lawer = 'a'; lawer <= 'z'; lawer++) {
				System.out.println(upper + " - " + lawer);
				if(lawer == 'g') break Outter;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void whileBreakExample() {
		
		while(true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("랜덤 주사위 숫자 : "+num);
			
			if(num == 6) break;
		}
		System.out.println("아웃");
	}

	private static void whileSumExample() {
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	public static void forFloatExample() {
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}
	
	public static void forSumExample() {
		int sum = 0;
		int i = 0;
		
		for(i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 "+(i-1)+"의 값은 "+sum+"입니다.");
	}

}

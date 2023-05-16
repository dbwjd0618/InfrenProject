package sample.other;

import sample.A;

public class B extends A {

	public void test() {
		System.out.println(this.a);
		System.out.println(this.b);	// protected 패키지는 다르지만, B가 A의 자식클래스 이므로  접근 가능
//		System.out.println(this.c); // default이므로 다른 패키지에서 접근불가 com.yj.sample.other.B -> com.yj.sample.A.c
//		System.out.println(this.d); // private  다른 클래스에서는 접근 불가
	}
}

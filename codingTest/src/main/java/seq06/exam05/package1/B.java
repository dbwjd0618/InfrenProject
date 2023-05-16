package seq06.exam05.package1;

public class B {

	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 2;
//		a.field3 = 3;	// private 접근 불가
		
		a.method1();
		a.method2();
//		a.method3();	// The method method3() from the type A is not visible
	}
}

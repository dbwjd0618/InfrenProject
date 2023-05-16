package sec02;

public class AbastractClass {

	public static void main(String[] args) {
		Child child = new Child();
		child.b();
	}

}

abstract class Parent {
	int a;

	public abstract void b();
}

class Child extends Parent{

	@Override
	public void b() {
	}
	
}
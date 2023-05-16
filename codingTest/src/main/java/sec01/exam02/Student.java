package sec01.exam02;

public class Student extends People {

	public int studentNo;
	
	// super가 없는경우 : Implicit super constructor People() is undefined. Must explicitly invoke another constructor
	// 부모의 기본 생성자가 없으니 다른 생성자를 명시적으로 호출
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	// 부모생성자 호출
		this.studentNo = studentNo;
	}
	/**
	 * 상속받은 People의 run 메소드의 접근 제한자는 public
	 * public 보다 제한을 걸어서 메소드 재정의를 하려고 하면 아래와 같은 에러가 발생함
	 * 
	 * Cannot reduce the visibility of the inherited method from People
	 * People에서 상속된 메소드의 가시성을 줄일 수 없습니다.
	 */
	@Override
	public void Run(String name) {
		System.out.println(name + "이(가) 달립니다.");
	}
}

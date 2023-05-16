package sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		
		Student student = new Student("홍길동", "880101-1234567", 1);
		System.out.println("이름 : " + student.name);
		System.out.println("주민번호 : " + student.ssn);
		System.out.println("번호 : " + student.studentNo);
		student.Run("길동");
	}

}

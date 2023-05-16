package sec01.exam02;

public class People {

	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public void Run(String name) {
		System.out.println("달리다.");
	}
}

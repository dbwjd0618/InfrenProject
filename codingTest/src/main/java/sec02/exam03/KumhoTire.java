package sec02.exam03;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotatioin) {
			System.out.println(location + " KumhoTire 수명 : " +
				(maxRotatioin - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}

}

package sec02.exam03;

public class HankookTirre extends Tire {

	public HankookTirre(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotatioin) {
			System.out.println(location + " HankookTire 수명 : " +
				(maxRotatioin - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}

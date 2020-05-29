class Automobile {
	private final String drive() {
		return "Driving vehicle";
	}
}
class Car extends Automobile {
	protected String drive() {
		return 	"Driving car";
	}
}

public class Q7 extends Car {
	public final String drive() {
		return "Driving electric car";
	}
	public static void main(String[] args) {
		final Car car=new Q7();
		System.out.print(car.drive());

	}
	/*
	 * Cevap B
	 */

}

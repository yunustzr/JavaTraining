
public class Q27 {
	
	public static void main(String...strings ) {
	
		boolean balloonInflated = false;
		do {
			if (!balloonInflated) {
				balloonInflated = true;
				System.out.print("inflate-");
				}
			} while (! balloonInflated); 		
		System.out.println("done");
		/*
		 * if dongusunde tersi alınır true olur.
		 * Ekrana "inflate-" yazar true olan balloonInflated while sartinda false oldugundan donguden cıkar.
		 * Cevap B
		 */

	}
	
}
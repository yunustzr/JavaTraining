class Math {   public final double secret = 2; }

class ComplexMath extends Math {
	public final double secret = 4;
}

public class Q40 extends ComplexMath { 
	
	public final double secret = 8;
	
	public static void main(String[] numbers) {
		Math math = new Q40();
		System.out.print(math.secret);
		/*
		 *  Complexmath subclassındaki secret değeri çağrılacaktır.
		 */
	}
}
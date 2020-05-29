abstract class Triangle {
	abstract String getDescription();
}
class RightTriagle extends Triangle {
	protected String getDescription() {
		return "rt";//g1
	}
	
}

public abstract class Q18 extends RightTriagle {//G2
	public String getDescription() {return "irt";}
	public static void main(String[] args) {
	final Triangle shape=new Q18();//g3
	System.out.print(shape.getDescription());
	/*
	 * Cevap C
	 */

	}

}

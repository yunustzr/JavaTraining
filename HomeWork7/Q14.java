interface Run{
	default void walk() {
		System.out.print("Walking and running!");
	}
}
interface Jog {
	default void walk() {
		System.out.print("Walking and jogging");
	}
}
public class Q14 implements Run,Jog{
    public void walk() {
    
    	System.out.print("Spriting!");
    }
	public static void main(String[] args) {
		new Q14().walk();

	}
	
	/*
	 * Cevap C
	 */

}

class Computer {
	protected final int process() {return 5;}
}
public class Q11 extends Computer{
	public final int process() {return 3;}

	public static void main(String[] args) {
    System.out.print(new Q11().process());
	}
	/*
	 * Final olan bir method override edilemez derleme hatasi alınır.
	 * Cevap C
	 */

}

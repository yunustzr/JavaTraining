
class Ship {
	protected int weight=3;
	private int height=5;
	public int getWeight() {return weight;}
	public int getHeigh() {return height;}
}
public class Q16 extends Ship {
    public int weight=2;
    public int height=4;
    public void printDetails() {
    	System.out.print(super.getWeight()+"-"+super.getHeigh());
    }
	public static void main(String[] args) {
    new Q16().printDetails();
	}
	/*
	 *Super ifades ust class ta tanımlamıs oldugumuz methodu cagırmakta kullanıyoruz.
	 *Cevap C
	 */

}

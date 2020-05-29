abstract class Rotorcraft {//abstract class olmali düzeltme yapma adına
	protected final int height=5;
	abstract int fly();
}
public class Q32  extends Rotorcraft{
  private int height=10;
  protected int fly() {
	  return super.height;
  }
	public static void main(String[] args) {
    //Q32 h= (Q32) new Rotorcraft();//Bu sekilde instance alamayiz 
    Rotorcraft h=new Q32();//Bu sekilde polymorphism dedigimiz çok şekillik kapsamında Q32 class ımızın ozelliklerine Rotorcraft atamıs olduk.
    System.out.println(h.fly());
	}

}

package HomeWork2;

public class Q43 {

	public void play() {
		System.out.print("play-");
	}
	public static void finelizer() {
		// TODO Auto-generated method stub
      System.out.print("clean-");
	}
    	public static void main(String[] args) {
       Q43 car =new Q43();
       car.play();
       System.gc();
       Q43 doll =new Q43();
       doll.play();
	}

}

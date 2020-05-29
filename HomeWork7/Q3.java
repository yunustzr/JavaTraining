
public class Q3 {
   public void playMusic() {
	   System.out.print("Play!");
   }
   private static int playMusic() {
	   System.out.print("music!");
	   //return 1;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q3().playMusic();

	}
	/*
	 * Ayni isme sahip metot tanimlamasinda bulunamayiz bunun dışında int veri tipinde oluşturulan data type return etmesi gerekiyor.
	 * method private tanimlandiginda ayni class icerisinden haric ulasilamaz.New ile olusturulan nesnede sadece void olarak tanimlanan methoda ulaşilir ve ekrana  "Play!" yazar.
	 * Cevap A
	 */

}

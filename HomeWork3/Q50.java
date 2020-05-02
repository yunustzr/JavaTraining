
public class Q50 {
   public static String play(int toy,int age) {
	   final String game;
	    if(toy<2)
	    	game =age >1 ? "1":"10"; //p1
	    	else
	    		game =age >3 ? "Ball":"Swim";//p2
	    		return game;
  }  
	public static void main(String[] args) {
    System.out.print(play(5, 2));
    /*
     * game değişkeni String türün de tanımlanmış veridir Termany operatoründe çıkan sonuç un da String olması gerekmektedir.
     * p1 satırında çıkan sonuçu string olarak dönmesini sağladığında compile edilecektir.
     * Code compile edilmesi durumunda sonuç 'Swim' çıktısıdır.
     * Cevap C
     */

 }
}

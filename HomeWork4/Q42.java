
public class Q42 {
    static int[][] game;
	public static void main(String[] args) {
	game=new int[4][4];//Kodun calısması icin nesneyi olusturmalıyız.
	game[3][3]=6;
	Object[] obj=game;
	//game[3][3]="X";İnt bir array ya String bir veri ekledigimizde hata alırız.Bu satırı kapattığımızda nulpointerException hatası alırız.Bos bir nesneye deger atama yaptıgımızdan.
	System.out.println(game[3][3]);
	/*
	 * Cevap B code bu haliyle derlenmez.
	 */
	}

}

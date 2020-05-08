import java.util.Arrays;

public class Q17 {

	public static void main(String[] args) {
    String[] os =new String[] {"Mac","Linux","Windows"};
    Arrays.sort(os);
    System.out.println(Arrays.binarySearch(os, "Mac"));
    /*
     * Array sort la sıralama algoritması string veri tipinde sıralama yapar.
     * binarySearch fonksiyonu dizinin herhangi bir elemanını hangi index te oldugunu bulur.
     * Cevap B
     */
	}

}

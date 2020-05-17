import java.util.*;
public class Q33 {

	public static void main(String[] args) {
    /*
    List<String> bottles=Arrays.asList("glass","plastic");
    for (int type = 0; type < bottles.size();) 
		System.out.print(bottles.get(type)+",");
	    //break;
    System.out.print("end");
    */
    //Duzeltilmis Hali
    List<String> bottles=Arrays.asList("glass","plastic");
    for (int type = 0; type < bottles.size();) {
		System.out.print(bottles.get(type)+",");
	    break;
		}
    System.out.print("end");
    
    /*
     * Break ifadesi dongulerde kullanilir.Donguden cıkıs icin burda dongunun {} parantezlerle sinirlandirilmadigi için kod hata verecektir.
     * for dongusunde son segment te belirtilmedigi icin 0 indexsi devamli ekrana basardi.Kodu parantezini ve break ifadesini de kullandigimizda ise
     * Ekrana glaas,end yazacaktir.
     * Cevap C
     */
	}

}

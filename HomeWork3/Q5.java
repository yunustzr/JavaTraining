import java.util.*;
import java.lang.*;
public class Q5 {

	public static void main(String[] args) {
    Scanner input_data=new Scanner(System.in);
	System.out.print("Corona test sonucu :/pozitif/negatif/yok =");
	String durum=input_data.next();
    switch (durum) {
    case "pozitif":
    	System.out.print("Koruyucu önlemler kapsamında evde kal.");
    	break;
    case "negatif" :
    	System.out.print("Corona virüs kapsamında #EVDEKAL sağlıklı kal..");
    default :
    	System.out.print("Corana Testi Mevcut Değildir..");
    	
    }
 }

}

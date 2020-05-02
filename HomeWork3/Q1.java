import java.util.*;

public class Q1 {

	public static void main(String[] args) {
	    /*
	    //Switch case statement larda kullanamayacagımız veri türü float ve double dir.Ondalık olarak kontrolünü gerçekleştiremiyoruz.
	    double deger=2.1;
	    switch(deger) {
	    case 2.1:
	    	System.out.print("eşleşme sağlanmıştır.");
	    break;
	    default:
	        System.out.print("Error");
	    }
	   */
		
		
		//Klavyeden veri okumak için scanner nesnesi olusturuyorum.
	
		Scanner read=new Scanner(System.in);
	    System.out.print("Yaşınızı Giriniz:");
	    int sayi=read.nextInt();
	    switch (sayi) {
		case 20:
			System.out.print("Genç yaştasınız.");
			break;
		case 35:
			System.out.print("Yolun Yarısı :)");
			break;
		case 70:
			System.out.print("Dünyadan Emeklilik Modu.");
		default:
			System.out.print("Bulunmayan bir deger girişi..");
		}

	}

}

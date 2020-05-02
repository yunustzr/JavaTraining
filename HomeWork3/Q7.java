import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
	    System.out.print("Yaşınızı Giriniz:");
	    int sayi=read.nextInt();
	    switch (sayi) {
		case 20:
			System.out.print("Genç yaştasınız.");
			break;//Şart sağlandığında dongüden çıkması için kullanılır.
		case 35:
			System.out.print("Yolun Yarısı :)");
			break;//Şart sağlandığında dongüden çıkması için kullanılır.
		case 70:
			System.out.print("Dünyadan Emeklilik Modu.");
			//Burda şartın sağlanması durumunda ekrana 'Dünyadan Emeklilik Modu.' ifadeyi yazar döngüden çıkmaz ve default daki sonucu ekrana basar.
		default:
			System.out.print("Bulunmayan bir deger girişi..");
		}
	    //Cevap B
	}

}

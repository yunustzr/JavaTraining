
import java.util.Scanner;
public class Q1
{
	public static void main(String[] args) {
		//DO-WHİLE ORNEGİ
		int sayi,defaultSayi=35;
	    boolean loop=true;
	    System.out.println("Sayi Tahmin Etme Oyunu");
	    do{ 
	        System.out.print("Tahmininizi Giriniz :");
	        Scanner input_text=new  Scanner(System.in);
            sayi=input_text.nextInt();
            if (sayi==defaultSayi){
                System.out.println("Kazandiniz.");
                loop=false;
            } else if (sayi>defaultSayi){
                System.out.println("Girilen sayi tahmin edilen sayidan büyük");
            } else if (sayi<defaultSayi){
                System.out.println("Girilen sayi tahmin edilen sayidan küçük");
            }
	    }while(loop);
        
        //WHİLE ORNEGİ
        loop=true;
        System.out.println("Yas Grubu Hesaplama");
        while (loop){
            System.out.print("Yas :");
	        Scanner input_text=new  Scanner(System.in);
            sayi=input_text.nextInt();
            if (sayi==defaultSayi){
                System.out.println("Yaş "+defaultSayi+" yolun yarisi..");
                loop=false;
            } else if (sayi>defaultSayi){
                System.out.println("Yasli yas grubu");
                loop=false;
            } else if (sayi<defaultSayi){
                System.out.println("Genc yas grubu");
                loop=false;
            }
        }
        /*
		*1.  do-while  and while   döngüleri boolean veri tipi kontrolü işlemi gerçekleştirir. Aralarındaki fark while da koşul doğru olması durumunda gövdeyi çalıştırır. Do while de en az bir kere gövdedeki işlem gerçekleştirilir.
		*Cevap A-D
		*/
        
	}
}

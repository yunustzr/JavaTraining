
public class Q20 {

	public static void main(String[] args) {
     int leaders = 10 * (2 +(1+2/5));
     int folowers =leaders +2;
     System.out.print(leaders + folowers <10 ? "Too few" :"Too many");
	}
    //Cevap C
	//Code compile edilemez.Açılan parantezlerin ')' kapatılması gerekir.Kapatılmadığından leaders değişkeninde hata almış olacağız.
	//Düzeltme yapıldığında alınacak sonuç "To many" mesajı dır.
}


public class Q12 {

	public static void main(String[] args) {
    int flair =15;
    if (flair >=15 && flair <37) {
    	System.out.print("Not enought");
    }
    if(flair==37) {
    	System.out.print("Just right");
    }else {
    	System.out.print("To many");
    }
    //Cevap D 
    //Not enoughtTo many çıktı oluşur.
    //İki if blogunda da kontrol gerçekleşir ilkinde deger refarans degerlerini sağladığı için çıktı verir.
    //İkinci if blogunda ise if şartı sağlanmıyor ama else kısmında ki çıktı da oluştugunda 'Not enoughtTo many' çıktısını alırız.
    
 }

}

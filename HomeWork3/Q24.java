
public class Q24 {

	public static void main(String[] args) {
    int flavors =30;
    int eaten =0;
    switch(flavors) {
    case 30:eaten++;System.out.println("Case30:"+eaten);
    case 40:eaten+=2;System.out.println("Case40:"+eaten);
    default:eaten--;System.out.println("Default:"+eaten);
    }
    System.out.println("Sonuç:"+eaten);
    /*
     * Switch Case ifadesinde istenilen şartı sağladığı CASE de işlem gerçekleşir.
     * Break ifadesi ile bitiriş sağlanmazsa default veya şartı sağlayan başka bir CASE deki işlemler gerçekleşir.
     * Cevap B
     */
 }

}

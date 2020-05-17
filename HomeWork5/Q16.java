
public class Q16 {
    private static int count;
    private static String[] stops=new String[] {"Washinton","Monroe","Jackson","LaSalle" };
    
	public static void main(String[] args) {
	while(count<stops.length) {
		System.out.println("1. "+count);//Aşamalari izlemek ve görmek için sürec izleme output larım.
		System.out.println(stops[count]);
		
		if(stops[count++].length()<8) {
			break;
		}
		System.out.println("2. "+count);
	}
	System.out.println(count);
	/*
	 * Defaul int degeri sıfırdır.dizinin boyutu 4 tür.İlk if şartında dizinin 0 indexsindeki "Washinton" sözcügünün uzunluğu '9' ilk şartı saglamadıgından if içerisindeki işlemi gerçekleştirmez.
	 * '1' indeksine geldiğinde ise "Monroe" uzunluğu 6 dır şart sağlandığından if döngüsüne girer ve break söz deyimi ile döngüden çıkar.
	 * Cevap B
	 */
	}

}

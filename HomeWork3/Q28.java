
public class Q28 {

	public static void main(String[] args) {
    int intersections =100;
    int streets=200;
    if(intersections <150) {
    	System.out.print("1");
    }else if (streets<2 && intersections>1000) {
    	System.out.print("2");
    }
    if(streets<500)
    	System.out.print("1");
    else
    	System.out.print("2");
  }
	/*
	 * İf kontrolünde hata almamak için şart olması gerekiyor 
	 * else if kısmında streets değişkeni için bir şart konulmadığı için boolean bir değer dönderemiyor.
	 * Düzeltme yapıldığında ise çıkan sonuç 11 dir.
	 * Cevap D
	 */

}

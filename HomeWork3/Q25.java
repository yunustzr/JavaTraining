
public class Q25 {
    public static String travel(int distance) {
    	return distance<1000 ? "train": "10";
    }
	public static void main(String[] args) {
    System.out.print(travel(500));
	}
    /*
     * Oluşturulan travel fonksiyonu String bir metod dur geriye string bir değer döndermesi gerekir.
     * 10 sayısı int bir deger olarak algıladığından compile etmiyecektir.
     * Cevap C
     */
}

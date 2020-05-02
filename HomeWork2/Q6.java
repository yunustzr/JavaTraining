package HomeWork2;

public class Q6 {

	public static void main(String[] args) {
		// Answer C
        //2 Fonksiyonu compile eder.
	}
	public String  convert(Integer value) {
		return value.toString();
	}
	public String  convert(Object value) {
		return value.toString();
	}
	public String  convert(int value) {
		return Integer.toString(value);
		//Deger tipli nesler de dönüşüm gerçekleştirmek için refarance tipli değişken üzerinden dönüşüm gerçekleştirmek gerekir.
	    //return value.toString();
	}

}

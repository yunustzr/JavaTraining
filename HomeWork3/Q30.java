
public class Q30 {

	public static void main(String[] args) {
    int x =10, y=5;
    boolean w=true,z=false;
    x=w ? y++ : y--;//true geldiği için y++ gerçekleşir.
    w=!z;//false tersi yenide w değişkenine atar.
    System.out.print((x+y)+""+(w ? 5:10));
	}
    /*
     * Termany operatoründeki temel mantık şart sağladığında true veya false dönmesidir.
     * w değişkeni direk termany operatorün istediği veri tipini sağlar.
     * 115 
     * Cevap B
     */
}


public class Q31 {

	public static void main(String[] args) {
    //String bob= new String("bob");
    //String notbob="bob";
    //System.out.print((bob==notbob)+""+(bob.equals(notbob)));
	/*
	 * Kodumuz bu şekilde olmuş olsaydı.false true dönecekti.Eşittir operatörü referance kontrolü gerçekleştirir.
	 * New metoduyla yeni nesne heap te oluşturulur.Bu oluşturduğumuz string ile new string faklı refarence de üretilmiş olur.
	 * Kodumuzdaki oluşturduğumuz nesneyi String değişkenine atamış olduk bu durumda aynı refarence degere sahip nesne olmuş oldular.
	 * true true döner
	 * Cevap A
	 */
    String bob= new String("bob");
    String notbob=bob;
    System.out.print((bob==notbob)+""+(bob.equals(notbob)));
	
	}

}

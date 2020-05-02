import com.sun.tools.javac.util.Convert;

public class Q9 {
    public void calculateResault(Integer candidateA,Integer candidateB) {
    	boolean process =candidateA ==null || candidateA.intValue() <10;
    	boolean value =candidateA && candidateB;
    	System.out.print(process);
    }
	public static void main(String[] args) {
    new Q9().calculateResault(null, 283);
	}
    //Cevap C Kod derlenmez.
	//Kodun derlenebilmesi için Boolean value değişkenine 'and' kapısı candidate değişkenleri  integer veri tipi olarak veri gönderilmiş bunun and kapısında karşılığı yoktur.
	//And kapısın true ,false degerler sonucu işlem karşılaştırması yapılabilir.
	//boolean value =null && 283 'and' leme ye çalışıyor 

}

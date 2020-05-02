
public class Q3 {

	public static void main(String[] args) {
	/*	
	String ifadeleri karşılaştırma yaptığımızda eşittir '==' ifadesi kullanırız.Bunun yanı sıra 'equals','compareTO' ifadeleri var.
	'==' ifadesi kullandığımız da aslında değer eşit mi değil mi diye kontrol yapmıyor.Nesne nin aynı refarans ta olup olmadığına bakıyor.
	Aynı refaransta olmadığında '==' bu ifade de false sonuç döndürür.
	Örnek-) String a=new String("yt");
	       	String b=new String("yt");
	       	System.out.print(a==b);//FALSE döner aynı değere sahip ama '=='operatorü refarans değerinin aynı olup olmadığını kontrol eder.
	True donmesini istiyorsak bu örneğin kontrolü equals la gerçekleştirmeliyiz.
	O yüzden b değişkenimiz String Havuzundan değil Heap’den referans aldığı ama a’nın referansı String Havuzunda olduğu için false sonucunun döndürüldüğünü görürüz.       	
    */
    String john="John";
    String jon=new String("John");
    System.out.print((john=jon)+""+john.equals(jon));
	}

}

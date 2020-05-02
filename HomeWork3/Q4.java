
public class Q4 {

	public static void main(String[] args) {
    /*
	  int plan =1;
	  plan =plan++ + --plan;
	  if(plan==1) {
	  System.out.print("PlanA");
	  }else {
	  if(plan==2) System.out.print("PlanB");	
	  }else System.out.print("PlanC");
	//4. sorudaki kodu yazdığımızda hata oluyoruz.Nedeni 3 lü kontrol sistemi gerçekleştirildiğinde if,else if,else şeklinde kullanımı yapmamız gerekir.
	//Burada if,else,else şeklinde kullanımından dolayı hata alıyoruz.
	*/
	
	//Kodu düzeltmesi yaptığımızda
		int plan =1;
		plan=plan++ + --plan;
		if(plan==1) {
			System.out.print("PlanA");
		}else if (plan==2) {
			System.out.print("PlanB");
		}else {
			System.out.print("PlanC");
		}
	//Cevap : B
  }
}

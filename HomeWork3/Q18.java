import java.util.*;

public class Q18 {

	public static void main(String[] args) {
    final long saturday =6;
    Scanner input_data=new Scanner(System.in);
    //Ekrandan veri girişi sağlamak için kullanılıyor.
    System.out.print("Gün giriniz:");
    final int dayofWeek=input_data.nextInt();
    switch (dayofWeek) {
	default:
		System.out.print("Another Weekday");
		break;
    case (int) saturday:
		System.out.print("Günlerden cumartesi");
		break;
    }
    
    //Cevap B
    //Switch case ifadelerinde kullanılan data type tipi tam sayı sağlayacak veri tipi kullanılmalıdır.
    //long kullanıldığında  int veri türüne convert edilerek kodumuzu çalıştırabaliriz.
  }

}

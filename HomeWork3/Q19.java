
public class Q19 {

	public static void main(String[] args) {
    int time = 12;
    int day = 2;
    String dinner =time >10 ? day<3 ? "Takeout" : "Saled" : "Leftovers";
	System.out.print(dinner);
	}
    /*      
     * Ternary operatorün de kullanımında dönen veri true ,false değeri kontrolüdür. '?' ifadesiyle kontrol gerçekleştirilir. 'int day=4' değişkenine atanılan deger ternary operatoründe kontrol edilecek bir şart yok bu da bize boolean veri tipli veri girişinin olması gerektiği hatasını vermekte ,yapılan kodsal değişiklikle program çalıştırıldı.
     * Burdaki çalışma mantığı ise iki ifadenin şartı sağlaması durumunda "Takeout",sadece birinin sağlaması durumunda "Saled" ,ikisinin de şartı sağlamaması durumunda "Leftovers" sonucunu dönderecektir.
     */
}

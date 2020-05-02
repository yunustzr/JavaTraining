
public class Q42 {
    public String runTest(boolean spinner,boolean roller) {
    	if(spinner = roller) return "up";
    	else return roller ? "down" :"middle";
    }
	public static void main(String[] args) {
    Q42 a=new Q42();
    System.out.print(a.runTest(false, true));
	/*
	 * spinner nesnesine true degeri atanıyor.İf şartı sağlanıyor anlamına geldiğinde if bloku içinde değişken dönüyor.
	 * Cevap A
	 */
  }

}

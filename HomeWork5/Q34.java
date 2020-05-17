
public class Q34 {

	public static void main(String[] args) {
     String[] nycTourLoops=new String[] {"Downtown","Uptown","Brooklyn"};
	 String[] times=new String[] {"Day","Night"};
	 for (int i = 0,j=0; i < nycTourLoops.length && j<times.length; i++,j++) {
	 System.out.print(nycTourLoops[i]+" "+times[j]+"-");	
	 }
	 /*
	  * ';' i++,j++ ifadesini noktali virgülle ayirdigimizda hata aliriz.',' ifadesiyle hata giderilir.
	  *Cevap C
	  */
  }

}

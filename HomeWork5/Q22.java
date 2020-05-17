
public class Q22 {

	public static void main(String[] args) {
    String[] fun=new String[] {"futbol","voleybol","tenis","basketbol"};
    for (int i = 0; i < fun.length; i++) {
		System.out.println(fun[i]);
	}
    //Bu döngünün for-each döngüsünde karşılığı
    for(String f:fun) {
    	System.out.print(f+"-");
    }
    /*
     * Cevap B
     */
	}

}

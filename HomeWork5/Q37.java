
public class Q37 {

	public static void main(String[] args) {
    String race="";
    loop:
    	do {
    		race+="x";
    		break loop;
    	}while(true);
        System.out.println(race);
        /*
         * Dongunun break olmadan once race degiskene 'x' atanir ve donguden cikilir.
         * Cevap B
         */
	}

}

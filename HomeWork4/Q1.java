
public class Q1 {
    static Integer topla(int...value) {
    	int topla=0;
    	for (int i = 0; i < value.length; i++) {
    		topla=value[i]+topla;
		}
    	
    	return topla;
    }

	public static void main(String[] args) {
		System.out.print(topla(1,2,3,4));

	}
	//Cevap B

}

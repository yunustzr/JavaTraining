import java.util.Arrays;

public class Q29 {

	public static void main(String[] args) {
    String[] os =new String[] {"Mac","Linux","Windows"};
    Arrays.sort(os);
    System.out.print(Arrays.binarySearch(os, "Redhat"));
	}
    //Cevap C
}

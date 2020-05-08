import java.util.Arrays;

public class Q32 {

	public static void main(String[] args) {
    String one=args[0];
    Arrays.sort(args);
    int result=Arrays.binarySearch(args, one);
    System.out.print(result);
	}
    //Cevap A
}

import java.util.Arrays;

public class Q50 {

	public static void main(String[] args) {
		Arrays.sort(args);
		String result =Arrays.binarySearch(args, args[0]);
		System.out.print(result);
		//Cevap C 
	}

}

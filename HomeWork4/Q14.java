import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
	
	long start=System.currentTimeMillis();
	int[] sayi=new int[] {5,6,1,2,3,4};
	Arrays.sort(sayi);
	System.out.println(Arrays.binarySearch(sayi, 3));
    long stop=System.currentTimeMillis()-start;
    System.out.println("Gecen süre :"+stop);
    
	/*
    long start1=System.currentTimeMillis();
	int[] sayi1=new int[] {5,6,1,2,3,4};
	System.out.println(Arrays.binarySearch(sayi1, 3));
    long stop1=System.currentTimeMillis()-start1;
    System.out.println("Gecen süre :"+stop1);
    */
    
	}

}

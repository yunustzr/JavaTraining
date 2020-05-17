
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	//For exapmle//
		int[] datalist=new int[5];
		System.out.println("Girilen 5 sayidan en büyüğü veren kod");
		Scanner input_text=new Scanner(System.in);//Ekrandan veri alma
		for (int i=0;i<datalist.length ;i++ ){
		    System.out.print((i+1)+".sayi :");
		    datalist[i]=input_text.nextInt();
		} 
		
        System.out.println("En büyük sayi:"+maxumum(datalist));
        System.out.println("En küçük sayi:"+minumum(datalist));
	}
	//For-each exapmle//
	public static int maxumum(int[] sayi){
	    int max=sayi[0];
	    for(int sum : sayi){
	        if (sum>max){
	            max=sum;
	        } 
	    }
	    return max;
	}
	public static int minumum(int[] sayi){
	    int min=sayi[0];
	    for(int num: sayi){
	        if (num<min){
	            min=num;
	        } 
	    }
	    return min;
	}
	/*
	*Cevap B-C 
	*/
}

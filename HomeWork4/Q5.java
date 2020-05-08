import java.util.Arrays;


public class Q5 {
    public void printStormName(String... names) {
    	System.out.print(Arrays.toString(names));
    }
    public void printStormNames(String[] names) {
    	System.out.print(Arrays.toString(names));
    }
	public static void main(String[] args) {
    Q5 std=new Q5();
    std.printStormName("Arlene");
    std.printStormName(new String[] {"Bret"});
  //std.printStormNames("Cindy");String array new ile oluşturmak 
    std.printStormNames(new String[] {"Don"});
    //Cevap C
    
	}

}

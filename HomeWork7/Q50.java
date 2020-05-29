import java.io.*;
class Machine {
	public boolean turnOn() throws EOFException, IOException {return true;}  
	// IOException throws olarak eklenmesi gerekmektedir.
}
public class Q50 extends Machine {
	public boolean turnOn() throws IOException {return false;}
	
	public static void main(String[] doesNotCompute) throws Exception {
		
		Machine m = new Q50();
		System.out.print(m.turnOn());
		
	}
	
}
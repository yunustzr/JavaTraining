abstract class Book {
	protected static String material ="papyrius";
	public Book() {}
	public Book(String meterial) {
		this.material=meterial;
	}
	
}
public class Q21 extends Book{
    public static String material="celluose";
    public Q21() {
    	super();
    	}
    public String getMaterial() {return super.material;}
    
    
	public static void main(String[] args) {
	System.out.print(new Q21().getMaterial());	
    
	
	}
	
	
    /*
     * Cevap A
     */
}

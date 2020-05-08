
class frisbee <Frisbee>
{
	public void toss (Frisbee... f) {
    	Frisbee first=f[0];
    	System.out.print(first);  	
    }
}
public class Q2 {
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frisbee std=new frisbee();
		
		std.toss(12,23,45);	 
	}
	//Cevap B
	/*
	 * Varangs parameter tek bir metod daki değişkene birden fazla verinin gönderilmesi sağlıyor. Bu veri array olarak tutulur.
	 * Bu veriyi kullanmak için dizilerde ilk endex 0 dan başlar f[0] la ilk degeri almış bulunuruz.
	 */

}


public class Q39 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		String str = new String("Leaves growing");
		
		do {   
			System.out.println(str);
		} while (builder); 
		System.out.println(builder);
		/*
		 * builder nesnesi boolean bir ifade olmadigi icin hata aliriz ve kod derlenmez.
		 * Cevap C
		 */

	}

}

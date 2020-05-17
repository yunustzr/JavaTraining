
public class Q38 {

	private static int count;
	private static String[] stops = new String[] { "Washington",
			"Monroe", "Jackson", "LaSalle" };
	
	public static void main(String[] args) {
		
		while (count < stops.length) 
		{ 	
		  if (stops[count++].length() < 8) {
			continue;
			}      
		}      	
		System.out.println(count);
		/*
		 * İF dongusunde ilk '0' indeks degeri icin "Washington" soz dizimi 10 harflidir saglamadıgında donguye girmez. 
		 *Cevap C
		 */
		
	} 	
	}
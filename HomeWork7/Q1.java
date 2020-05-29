
class Cinema {
	private String name;
	public Cinema() {}
	public Cinema(String name) {
		this.name=name;
		System.out.print(name);
	}
}
public class Q1 {
	public Q1(String movie) {}
	public static void main(String[] args) {
		Cinema cnm=new Cinema("Hızlı ve Öfkeli 5");
	//	System.out.print(new Q1("Another Trilogy").name);

	}
	/*
	 * Constructor tanimlamasinda parametreli contructor tanimlamasi yaparken oncelikler default
	 * contructor olusturulmalidi aksi halde hata verecektir.
	 * Cevap C 
	 * 
	 */

}

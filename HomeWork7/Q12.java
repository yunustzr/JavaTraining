import java.io.FileNotFoundException;
import java.io.IOException;

class School{
	public int getNumberOfStudentPerClassroom(String...students) throws IOException {
    return 3;		
	}
	public int getNumberOfStudentPerClassroom() throws IOException {
	return 9;		
	}
}
public class Q12 extends School  {
    public int getNumberOfStudentPerClassroom() throws FileNotFoundException {
    	return 2;
    }
	public static void main(String[] args) throws IOException {
    School school =new Q12();
    
    System.out.print(school.getNumberOfStudentPerClassroom());
	}
	/*
	 * Tanimlanan sinif override edildiği icin türetilmis sınıfın degil kendi ozelligi kendi methodunun return type ni dondurur.
	 * Cevap B
	 * Cevap B
	 */

}



interface SpeakDialogue {
	default int talk() {
		return 7;
	}
	
}

interface SingMonologue {
	default int talk() { 
		return 5;
	} 
	
}

public class Q37 implements SpeakDialogue, SingMonologue {
	public int talk(String... x) {
		return x.length;
	}
	// override yapılması için aynı imzada metodlar kullanılması yerine aşağıdaki gibi ayrıca bir metod eklenmelidir.
	@Override
	public int talk() {
		// TODO Auto-generated method stub
		return SingMonologue.super.talk();
	}

	public static void main(String[] notes) {
		System.out.print(new Q37().talk(notes));
		}
}
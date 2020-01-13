package edunovajp21;

public class Zadaca02 {

	public static void main(String[] args) {
		// Kreirati program koji ispisuje tablicu množenja 15x15
		
		for(int x=0;x<15;x++) {
			for(int y=0;y<15;y++) {
				System.out.print((x+1)*(y+1) + "\t");
			}
			System.out.println();
		}
	}

}

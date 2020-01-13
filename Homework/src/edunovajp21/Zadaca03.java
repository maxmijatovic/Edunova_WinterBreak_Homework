package edunovajp21;

import javax.swing.JOptionPane;

public class Zadaca03 {

	public static void main(String[] args) {
		// Kreirati program koji za dva unesena broja ispisuje sve prim brojeve između njih
		
       
        boolean prim= true;
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi manji broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi veci broj"));
		
		for(int i = a; i <= b; i++) {
			prim = true;
			
			for(int j = 2; j<= i && prim==true; ++j) {
				if(i % j == 0) {
					prim = false;
					break;
				}else {
					prim = true;
				}
				
				if(prim == true) {
					System.out.println(i);  //nesto ne valja ???
				}
		
		    }
		
		}

	}

}


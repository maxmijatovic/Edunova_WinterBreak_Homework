package edunovajp21;

import javax.swing.JOptionPane;

public class Zadaca01 {

	public static void main(String[] args) {
		// Kreirati program koji unosi 24 broja, ispisuje njihov zbroj, najmanji i najveći uneseni broj
		
		int [] niz = new int [24];
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));  
		
		for (int i = b; i <=23; i++){
			b=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));  
			
			sum += b;
			niz[i] = b;
			
		
		if(b<min) {
			min = b;
		}
			
		
		if(b>max) {
			max = b;
		  }
		}
			
			
			System.out.println(sum);
			System.out.println(min);
			System.out.println(max);
		}
		
	
}

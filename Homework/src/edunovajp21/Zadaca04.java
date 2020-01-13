package edunovajp21;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadaca04 {

	public static void main(String[] args) {
		// Kreirati program koji unosi dvije matrice 4x4 te ispisuje njihov zbroj
		
		

		int [][] matrica1 = new int[4][4];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				matrica1 [i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj na mjesto za matricu1: " + (i+1) + "," + (j+1)));
			}
		}
		
		
		int [][] matrica2 = new int [4][4];
		
		for(int k = 0; k < 4; k++) {
			for(int l = 0; l < 4; l++) {
				matrica2 [k][l] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj na mjesto za matricu2: " + (k+1) + "," + (l+1)));
			}
		}
		
		int [][] sum = new int[4][4];
		
				
		for(int m = 0; m < 4; m++) {
			for (int n = 0; n < 4; n++) {
				sum[m][n] = matrica1 [m][n] + matrica2 [m][n];
			}
		}
		
		System.out.println(Arrays.toString(sum[0]));
		System.out.println(Arrays.toString(sum[1]));
		System.out.println(Arrays.toString(sum[2]));
		System.out.println(Arrays.toString(sum[3]));
		
		
		
		
		
		
		
		
		
		
		

	}

}

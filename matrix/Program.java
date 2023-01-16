package matrix;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j ++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i=0; i<n; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		
		int count = 0;
		for (int i=0; i<n; i ++) {
			for (int j=0; j<n; j++) {
				if(matrix[i][j] < 0) {
					count += 1;
				}
			}
		}
		System.out.println();
		System.out.println("Negative number = " + count);
		
		sc.close();
	}

}

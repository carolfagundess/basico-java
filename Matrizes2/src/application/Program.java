package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rows does this matrix have? ");
		int n = sc.nextInt();
		System.out.print("How many columns does this matrix have? ");
		int m = sc.nextInt();
		
		int[][] mat = new int[m][n];

		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("enter a number: ");
		int X = sc.nextInt();
		
		
		//
		for (int i = 0; i <mat.length; i++) {
			for (int j = 0; j <mat.length; j++) {
				if (mat[i][j] == X ) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		sc.close();
	}
}

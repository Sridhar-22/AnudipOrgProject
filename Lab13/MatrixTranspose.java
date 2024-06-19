package practise;

import java.util.Scanner;

public class MatrixTranspose {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows = 3;//rows
		int cols = 4;//coloms
		int[][] matrix = new int[rows][cols];
		int[][] transpose = new int[cols][rows];

		
		System.out.println("Enter the elements of the 3x4 matrix:");//Getting matrix data from user
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Element [" + i + "][" + j + "]: ");
				matrix[i][j] = scanner.nextInt();
			}
		}

		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}

		
		System.out.println("Original Matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		
		System.out.println("Transpose of the Matrix:");
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

	}
}

package practise;

import java.util.Scanner;

public class SumPositiveOddNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array ");
		int n = scanner.nextInt();

		int[] array = new int[n];

		System.out.println("Enter the elements ");
		for (int i = 0; i < n; i++) {
			System.out.print("Element "+ i );
			array[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] > 0 && array[i] % 2 != 0) {
				sum += array[i];
			}
		}

		System.out.println("Sum of positive odd numbers: " + sum);

		scanner.close();
	}

}

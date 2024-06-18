package Lab7;

import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int limit = scanner.nextInt();
		scanner.close();

		for (int num = 2; num <= limit; num++) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}

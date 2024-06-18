package Lab7;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continueCalculation = true;

		while (continueCalculation) {
			System.out.print("Enter the first number: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Invalid input. Please enter a valid number.");
				scanner.next();
			}
			double num1 = scanner.nextDouble();

			System.out.print("Enter the second number: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Invalid input try again");
				scanner.next();
			}
			double num2 = scanner.nextDouble();

			System.out.print("Select Options(+, -, *, /): ");
			String operation = scanner.next();

			double result;
			boolean validOperation = true;

			switch (operation) {
			case "+":
				result = num1 + num2;
				System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
				break;
			case "-":
				result = num1 - num2;
				System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
				break;
			case "*":
				result = num1 * num2;
				System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, result);
				break;
			case "/":
				if (num2 != 0) {
					result = num1 / num2;
					System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
				} else {
					System.out.println("Error: Division by zero is not allowed.");
				}
				break;
			default:
				System.out.println("Invalid operation. Please choose +, -, *, or /.");
				validOperation = false;
			}

			if (validOperation) {
				System.out.print("Do you want to continue (yes/no): ");
				String userChoice = scanner.next();
				if (!userChoice.equalsIgnoreCase("yes")) {
					continueCalculation = false;
				}
			}
		}

		System.out.println("Exit");
	}
}

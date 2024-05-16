package Lab1;

import java.util.Scanner;

public class prog1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String userInput;
		do {
		System.out.print("Yes or No");
		userInput = s.next().toUpperCase();

		if (userInput.equals("YES")) {
		System.out.print("Enter the radius of the circle: ");
		double radius = s.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.println("The area of the circle is:" + area);
		}
	} while (userInput.equals("YES"));

		System.out.println("Thank you");
		
	}
}

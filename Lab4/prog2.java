package Lab1;

import java.util.Scanner;

public class prog2 {

	public static void main(String[] args) {
		int a, b,z;
		System.out.println("Enter the values of a and b");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		z=a+b;
		System.out.println("a+b="+z);
		
		z=a-b;
		System.out.println("a-b="+z);
		
		z=a*b;
		System.out.println("a*b="+z);
		
		z=a/b;
		System.out.println("a/b="+z);

	}

}

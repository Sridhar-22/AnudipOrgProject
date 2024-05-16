package Lab1;
import java.util.Scanner;
public class prog4 {

	public static void main(String[] args) {
		double balance=1000;
		System.out.println("Choose the options from below");
		Scanner s=new Scanner(System.in);
		System.out.println("1.deposite 2.Withdraw 3.Current balance");
		int option=s.nextInt();
		switch(option) {
		case 1:
			System.out.print("Enter the deposite amount:");
			int deposite=s.nextInt();
			balance=deposite+balance;
			System.out.println("Done");
			break;
		case 2:
			System.out.println("Enter the withdraw amount");
			int withdraw=s.nextInt();
			if(withdraw<balance) {
			balance=balance-withdraw;
			System.out.println("Done");
			}
			else {
				System.out.println("Insufficient balance");
			}
		case 3:
			System.out.println("Your current balance is: "+balance);
		}
		
		

	}

}

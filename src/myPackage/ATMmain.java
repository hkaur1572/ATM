package myPackage;

import java.util.Scanner;

public class ATMmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attempt = 3;
		int counter = 3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("ATM Machine");
		ATM atm = new ATM(1111);
		System.out.println("Please Enter Your pin number");

		int Number = scanner.nextInt();
		Person person = new Person("Harepreet kaur", Number, "ABCD1234", 2800, 4000, 5000);
		if (1111 == Number) {
			System.out.println("Name of Account holder: " + Person.customerName.trim());
			System.out.println("Account Number: " + person.getAccountNo());

			
			/*  System.out.println("Enter the name of Customer"); String name=scanner.next();
			  
			  System.out.
			  println("Enter the security number that bank had setup for you when you opened your account"
			  ); int securityNo =scanner.nextInt(); person.setAccountNo("abcd12345",
			  true,name, securityNo); System.out.println("Account Number: " +person.getAccountNo());*/
			 
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");

			System.out.println("Choose 4 for EXIT");
			System.out.println("Choose the operation you want to perform:");

			atm.cashdeposit(person);
			

		}
		while (!(1111 == Number) && attempt != 0) {

			System.out.println("Invalid PIN entered!. " + --attempt + " attempts remaining.");
			counter--;
			if (attempt != 0) {

				System.out.println("Enter your  PIN: ");
				int Number1 = scanner.nextInt();

				if (1111 == Number1) {
					// System.out.println("Correct PIN entered!");
					System.out.println("Name of Account holder: " + Person.customerName);
					System.out.println("Choose 1 for Withdraw");
					System.out.println("Choose 2 for Deposit");
					System.out.println("Choose 3 for Check Balance");

					System.out.println("Choose 4 for EXIT");
					System.out.println("Choose the operation you want to perform:");

					atm.cashdeposit(person );
					break;
				}
			} else

			{

				System.out.println("Your Account is locked");

				break;

			}

		}
	}
}

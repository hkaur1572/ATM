package myPackage;

import java.util.Scanner;

public class ATM {

	double depositCash;
	double cashWithdraw;

	private int Pin;
	static double limit = 2000;
	Scanner scanner = new Scanner(System.in);

	public int getPin() {
		return Pin;
	}

	public void setPin(int pin) {
		Pin = pin;
	}

	ATM(int pin) {

		Pin = pin;

	}

	public void cashdeposit(Person p) {

		int n = scanner.nextInt();
		switch (n) {

		case 1:

			System.out.println("Enter the money to be withdrawn");
			cashWithdraw = scanner.nextDouble();
			System.out.println("Enter the account name form where you want to withdraw your money");
			String accountName = scanner.next();
			if (accountName.equalsIgnoreCase(p.accountType1)) {

				if (cashWithdraw < limit) {
					if (p.checkingMoney > cashWithdraw) {
						p.checkingMoney = p.checkingMoney - cashWithdraw;

						System.out.println("Please collect your money " + cashWithdraw);
						System.out.println("Now your remaining balance in checking account is :  " + p.checkingMoney);
						p.totalFunds = p.checkingMoney + p.savingMoney + p.TFSAMoney;
						System.out.println("Now your remaining total balance is : " + p.totalFunds);
						limit -= cashWithdraw;
					} else {
						System.out.println("Insufficient Balance");

					}
				} else {

					System.out.println(" You Can only Withdraw upto" + limit + " per day ");
				}

			}
			if (accountName.equalsIgnoreCase(p.accountType2)) {
				System.out.println("For selecting saving accout you wil be charged 5% on your withdrawn money");

				if (p.savingMoney > cashWithdraw) {
					if (cashWithdraw < limit) {

						p.savingMoney = p.savingMoney - cashWithdraw;
						System.out.println("Please collect your money " + cashWithdraw);

						p.savingMoney = p.savingMoney - 0.05 * cashWithdraw;
						System.out.println("Now your remaining balance in your saving account is:  " + p.savingMoney);
						p.totalFunds = p.checkingMoney + p.savingMoney + p.TFSAMoney;
						System.out.println("Now your remaining total balance is : " + p.totalFunds);

					} else {
						System.out.println(" You Can only Withdraw upto " + limit + "  per day ");

					}
				} else {
					System.out.println("Insufficient Balance");

				}

			}
			if (accountName.equalsIgnoreCase(p.accountType3)) {
				System.out.println("You Cannot directly withdraw your money from Your TFSA account");
			}
			System.out.println("");
			break;

		case 2:
			System.out.println("enter the money to be deposited ");
			depositCash = scanner.nextDouble();
			System.out.println("Enter the account name in which you want to deposit your money");
			String accountName1 = scanner.next();
			if (accountName1.equalsIgnoreCase(p.accountType1)) {

				p.checkingMoney = p.checkingMoney + depositCash;
				System.out.println("Your Money has been successfully deposited money in your checking account : "
						+ p.checkingMoney);
				p.totalFunds = p.checkingMoney + p.savingMoney + p.TFSAMoney;
				System.out.println("Your total balance is : " + p.totalFunds);
			}
			if (accountName1.equalsIgnoreCase(p.accountType2)) {

				p.savingMoney = p.savingMoney + depositCash;
				System.out.println(
						"Your Money has been successfully deposited money in your saving account : " + p.savingMoney);
				p.totalFunds = p.checkingMoney + p.savingMoney + p.TFSAMoney;
				System.out.println("Your total balance is : " + p.totalFunds);
			}

			if (accountName1.equalsIgnoreCase(p.accountType3)) {

				p.TFSAMoney = p.TFSAMoney + depositCash;
				System.out.println(
						"Your Money has been successfully deposited money in your TFSA account : " + p.TFSAMoney);
				p.totalFunds = p.checkingMoney + p.savingMoney + p.TFSAMoney;
				System.out.println("Your total balance is : " + p.totalFunds);
			}
			break;

		case 3:
			p.totalFunds = p.checkingMoney + p.savingMoney + p.TFSAMoney;
			System.out.println("Total balance in Your Account is : " + p.totalFunds);
			break;

		case 4:
			System.out.println("Home Screen of ATM ");
			System.exit(0);
			break;
		}
	}

}
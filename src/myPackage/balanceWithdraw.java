package myPackage;
import java.util.Scanner;
public class balanceWithdraw {
static double limit=3000;
double accountBalance=2000;
Scanner s=new Scanner(System.in);

public void getwithdraw() {
	System.out.println("Enter the amount of money you want to withdraw");
	double withdraw=s.nextDouble();
	if(withdraw>limit) {
		System.out.println("you can only withdraw" + limit+ "as per your daily limit");
	}else {
		if(withdraw>accountBalance) {
			System.out.println("You don not have sufficiant balance in your account");
		}else {
			
			System.out.println("Please collect your money " + withdraw);
			System.out.println("your remaning limti for the day is "+ (limit-=withdraw));
			accountBalance-=withdraw;
			
			
		}}if ((limit!=0)&& (withdraw<limit)) {
			getwithdraw();
			
		}else {
			
			//System.out.println("exit());
			
		}
	

}}


	

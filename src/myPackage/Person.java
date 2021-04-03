package myPackage;


public class Person {

	private String AccountNo;

	static String customerName;
	double totalFunds;
	String accountType1 = "checking";
	String accountType2 = "Saving";
	String accountType3 = "TFSA";
	double checkingMoney;
	double savingMoney;
	double TFSAMoney;
	int pinNumber;
	int number = 1993;
	String Name;

	public String getAccountNo() {
		return AccountNo;

	}

	public void setAccountNo(String accountNo, boolean isRightcustomer, String name, int securityNo) {

		if ((securityNo == number) && (customerName.trim().equalsIgnoreCase(name)) && isRightcustomer) {
			this.AccountNo = AccountNo;
			System.out.println("Account Number is changed");
		} else {
			System.out.println("Your information does not match with the bank information");
		}

	}

	public Person(String name, int number, String anumber, double checkingM, double savingM, double TFSAM) {

		customerName = name.trim();
		// totalFunds = tfunds;

		pinNumber = number;
		AccountNo = anumber;
		checkingMoney = checkingM;
		savingMoney = savingM;
		TFSAMoney = TFSAM;

	}

	public Person(String name, int accountNumber) {
	Name=name;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Person(){}
	
}

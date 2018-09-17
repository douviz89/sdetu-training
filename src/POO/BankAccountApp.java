package POO;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BankAccount acc1 = new BankAccount("994289756", 1000.0);
//		BankAccount acc2 = new BankAccount("345629671", 2000.0);
//		BankAccount acc3 = new BankAccount("237894325", 1500.50);
//		
//		acc1.setName("douv");
//		acc1.makeDeposit(4000);
//		acc1.payBill(756);
//		acc1.accrue();
//		System.out.println(acc1.toString());
		
		
	}

}


class BankAccount implements IInterest {
	//properties of the bank account
	private static int iD = 1000;  // internal id
	private String accountNumber;    // ID + random 2-digits number + first 2 of SSN
	private static final String routingNumber = "FR6735425";    // IBAN : 
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit) {
		this.iD++;
		this.SSN = SSN;
		setAccountNumber();
		this.balance = initDeposit;
	}

	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		this.accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number : " + this.accountNumber);
	}
	
	public void makeDeposit(double amount) {
		this.balance += amount;
		showBalance();
	}
	
	public void payBill(double amount) {
		this.balance -= amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Your new balance is : " + this.balance + "€");
	}
	
	@Override
	public void accrue() {
		this.balance = this.balance * ( 1 + rate/100 );
		showBalance();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.getName() + " has a bank account N°" + this.accountNumber + ", the balance is " + this.balance +"€";
	}
	
}
